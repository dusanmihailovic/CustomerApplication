package com.like2code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like2code.model.Customer;
import com.like2code.model.Item;
import com.like2code.model.Product;
import com.like2code.model.ShoppingReport;
import com.like2code.repository.CustomerRepository;
import com.like2code.repository.ItemRepository;

@Service
@Transactional
public class ApplicationService {

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	public List<ShoppingReport> findAllShoppingReports() {
		return customerRepository.findAllShoppingReports();
	}

	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<Product>();

		Product tab = new Product();
		tab.setDescription("Tablet");
		products.add(tab);

		Product comp = new Product();
		comp.setDescription("Computer");
		products.add(comp);

		Product lap = new Product();
		lap.setDescription("Laptop");
		products.add(lap);

		return products;

	}

	@Transactional
	public Item save(Item item) {
		item = itemRepository.save(item);
		return item;
	}

}
