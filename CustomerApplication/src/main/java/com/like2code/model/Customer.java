package com.like2code.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Long customerId;
	
	private String firstName;
	private String lastName;
	private String city;

	public String getCity() {
		return city;
	}
	public Long getCustomerId() {
		return customerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
