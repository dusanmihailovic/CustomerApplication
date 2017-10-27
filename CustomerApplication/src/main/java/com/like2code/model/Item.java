package com.like2code.model;

public class Item {
	
	private String orderItem;
	private int quantity;
	private double price;
	
	public String getOrderItem() {
		return orderItem;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
