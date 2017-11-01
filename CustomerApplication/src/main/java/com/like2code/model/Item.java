package com.like2code.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private Long customerId;
	
	private String product;
	
	private String orderItem;
	private int quantity;
	private double price;
	
	@ManyToOne
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public String getOrderItem() {
		return orderItem;
	}
	public double getPrice() {
		return price;
	}
	public String getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
