package com.like2code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;
import com.like2code.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	public Customer save(Customer customer) {

		return customerRepository.save(customer);
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.loadAll();
	}

	public List<ShoppingReport> findAllShoppingReports() {
		
		return customerRepository.findAllShoppingReports();
	}

}
