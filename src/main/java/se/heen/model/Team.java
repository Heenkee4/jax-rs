package se.heen.model;

public class Team {

	private String number;
	private String name;
	private boolean active;

	public Team(String number, String name, boolean active) {
		this.number = number;
		this.name = name;
		this.active = active;

	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	@Override
	public String toString() {

		return number + ", " + name + ", " + active;
	}
}
