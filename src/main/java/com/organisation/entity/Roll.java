package com.organisation.entity;

public class Roll {
	private int id;
	private String userCreation;
	private String userDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCreation() {
		return userCreation;
	}
	public void setUserCreation(String userCreation) {
		this.userCreation = userCreation;
	}
	public String getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(String userDetails) {
		this.userDetails = userDetails;
	}
	@Override
	public String toString() {
		return "Roll [id=" + id + ", userCreation=" + userCreation + ", userDetails=" + userDetails + ", getId()="
				+ getId() + ", getUserCreation()=" + getUserCreation() + ", getUserDetails()=" + getUserDetails() + "]";
	}

}
