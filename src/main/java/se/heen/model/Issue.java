package se.heen.model;

public class Issue {
	
	private String number;
	private String name;

	public Issue(String number, String name) {
		this.number = number;
		this.name = name;
	}
	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return number + ", " + name;
	}
}

