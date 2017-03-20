package se.heen.repository;

import se.heen.model.Issue;

public interface IssueJaxRSRepository {
	
	Issue createIssue();

	Issue createIssue(Issue issue);

	void updateIssue();

	Issue updateIssue(Issue issue);

	
	

}
