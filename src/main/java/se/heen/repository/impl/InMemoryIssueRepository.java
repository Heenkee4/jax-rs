package se.heen.repository.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.Path;

import se.heen.model.Issue;
import se.heen.repository.IssueJaxRSRepository;

@Path("/issue")
public class InMemoryIssueRepository implements IssueJaxRSRepository {
	
	private final Map<String, Issue> issues = new HashMap<>();
	@Override
	public Issue createIssue(Issue issue) {
		
		String number = UUID.randomUUID().toString();
		issue = issue.setNumber(number);
		issues.put(number, issue);

		return issue;
		
	}
	public Issue get(String number) {
		return issues.get(number);
	}
	
	@Override
	public Issue updateIssue(Issue issue) {
		return issues.replace(issue.getNumber(), issue);

		
	}

	@Override
	public Issue createIssue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateIssue() {
		// TODO Auto-generated method stub
		
	}

}
