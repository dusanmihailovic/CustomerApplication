package com.like2code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;
import com.like2code.service.ApplicationService;

@Controller
public class CustomerController {
	
	@Autowired
//	private CustomerService customerService;
	private ApplicationService customerService;
	
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
	
	@RequestMapping(value="getCustomer", method = RequestMethod.GET)
	public String getCustomers(Model model){
		List<Customer> customers = customerService.findAllCustomers();
		
		model.addAttribute("customers", customers);
		
		return "getCustomer";
	}
	
	@RequestMapping(value="shoppingReport", method=RequestMethod.GET)
	public String getShoppingReport(Model model){
		List<ShoppingReport> shoppingReports = customerService.findAllShoppingReports();
		
		model.addAttribute("shoppingReport", shoppingReports);
		
		return "shoppingReport";
	}
}
