package com.like2code.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name=Customer.FIND_SHOPPING_REPORTS, query="Select new com.like2code.model.ShoppingReport(c.firstName, c.lastName, i.orderItem, i.product, i.quantity, i.price)" + 
			"from Customer c, Item i where c.customerId = i.customerId"),
	@NamedQuery(name=Customer.FIND_ALL_CUSTOMERS, query="Select c from Customer c")
})

public class Customer {
	
	public static final String FIND_ALL_CUSTOMERS = "findAllCustomers";
	public static final String FIND_SHOPPING_REPORTS = "findShoppingReports";
	
	@Id
	@GeneratedValue
	private Long customerId;
	
	private String firstName;
	private String lastName;
	private String city;
	
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Item> items = new ArrayList<Item>();

	public String getCity() {
		return city;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public List<Item> getItems() {
		return items;
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
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
