package com.like2code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.like2code.model.Item;

@Controller
@SessionAttributes("item")
public class ItemController {
	
	@RequestMapping(value = "/addItem", method = RequestMethod.GET)
	public String addItem(Model model){
		
		Item item = new Item();
		item.setQuantity(1);
		model.addAttribute("item", item);
		
		return "addItem";
	}
	
	@RequestMapping(value = "/addItem", method =  RequestMethod.POST)
	public String updateItem(@ModelAttribute("item") Item item){ 
		
		System.out.println("Order item is: " + item.getOrderItem());
		
		return "addItem";
	}

}

	