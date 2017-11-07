package com.like2code.service;

import java.util.List;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;

public interface CustomerService {
	
	Customer save(Customer customer);

	List<Customer> findAllCustomers();

	List<ShoppingReport> findAllShoppingReports();

}
