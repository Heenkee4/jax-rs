package se.heen.model;

public class IssueParser {
	
	public static Issue fromString(String issueString) {
		
		String[] parts = issueString.split(",");
		String id = parts[0];
		String number = parts[1];
		String name = parts[2];
		
		return new Issue(number, name);
	}

}
