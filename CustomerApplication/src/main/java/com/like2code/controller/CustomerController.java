package com.like2code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.like2code.model.Customer;
import com.like2code.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String getCustomer(@ModelAttribute ("customer") Customer customer){
		
		return "addCustomer";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute ("customer") Customer customer){
		
		System.out.println("customer is: " + customer.getFirstName());
		
		customerService.save(customer);
		
		return "addCustomer";
	}
	
	
}
