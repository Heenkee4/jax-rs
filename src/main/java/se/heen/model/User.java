package se.heen.model;

public class User {
	
	private String number;
	private String firstName;
	private String lastName;
	private String userName;
	private boolean active;
	
	public User(String number, String firstName, String lastName, String userName, boolean active) {
		
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		}

	public String getNumber() {
		return number;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public Boolean isActive() {
		return active;
	}
		
	@Override
	public String toString() {
		return  number + ", " + firstName + ", " + lastName + ", " + userName + ", " + active;
	}
}
