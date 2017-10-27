package com.like2code.model;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	
	public String getCity() {
		return city;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getState() {
		return state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setState(String state) {
		this.state = state;
	}

}
