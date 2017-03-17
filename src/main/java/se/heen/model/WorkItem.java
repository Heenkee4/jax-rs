package se.heen.model;

import se.mawe.model.WorkItem.Status;

public class WorkItem {
	
	private String number;
	private String name;
	private Status status;
	private boolean active;
	
	public static enum Status {
		UNSTARTED, STARTED, DONE;
	}
	
	public WorkItem(String number, String name, Status status, boolean active){
		this.number = number;
		this.name = name;
		this.status = status;
		this.active = active;
	}
	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Status getStatus() {
		return status;
	}

	public boolean isActive() {
		return active;
	}
	
	@Override
	public String toString() {
		return name + ", " + status; 
	}

}
