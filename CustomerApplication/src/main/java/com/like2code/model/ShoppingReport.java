package com.like2code.model;

public class ShoppingReport {
	
	private String customerName;
	private String customerSurname;
	private String itemOrder;
	private String itemProduct;
	private int itemQuantity;
	private double itemPrice;
	
	public ShoppingReport(String customerName, String customerSurname, String itemOrder, String itemProduct, int itemQuantity, double itemPrice) {
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.itemOrder = itemOrder;
		this.itemProduct = itemProduct;
		this.itemQuantity = itemQuantity;
		this.itemPrice	= itemPrice;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public String getItemOrder() {
		return itemOrder;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public String getItemProduct() {
		return itemProduct;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public void setItemOrder(String itemOrder) {
		this.itemOrder = itemOrder;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public void setItemProduct(String itemProduct) {
		this.itemProduct = itemProduct;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

}
