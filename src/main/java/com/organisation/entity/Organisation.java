package com.organisation.entity;

public class Organisation {
	private int id;
	private String employeeName;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Organisation [id=" + id + ", employeeName=" + employeeName + ", password=" + password + ", getId()="
				+ getId() + ", getEmployeeName()=" + getEmployeeName() + ", getPassword()=" + getPassword() + "]";
	}
	
}
