package com.like2code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.like2code.model.Customer;
import com.like2code.model.State;
import com.like2code.service.StateService;

@Controller
public class CustomerController {
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping(value = "/addCustomer")
	public String addCustomer(@ModelAttribute ("customer") Customer customer){
		
		System.out.println("customer is: " + customer.getFirstName());
		
		return "addCustomer";
	}
	
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public @ResponseBody List <State> findAllStates(){
		return stateService.findAllStates();
		
	}
	
}
