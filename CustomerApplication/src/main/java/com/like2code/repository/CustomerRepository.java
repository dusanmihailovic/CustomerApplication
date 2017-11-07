package com.like2code.repository;

import java.util.List;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;

public interface CustomerRepository {
	
	Customer save(Customer customer);

	List<Customer> loadAll();

	List<ShoppingReport> findAllShoppingReports();

}
