package com.like2code.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.like2code.model.Customer;
import com.like2code.model.Item;
import com.like2code.model.Product;
import com.like2code.service.ItemService;

@Controller
@SessionAttributes
public class ItemController {
	
	@Autowired
	public ItemService itemService;
	
	@RequestMapping(value = "/addItem", method = RequestMethod.GET)
	public String addItem(Model model, HttpSession session){
//		Item item = new Item();
		
		Item item = (Item)session.getAttribute("item"); 
		
		if(item == null) {
			item = new Item();
			item.setQuantity(1);
		}
		
		model.addAttribute("item", item);
		
		return "addItem";
	}
	
	@RequestMapping(value = "/addItem", method =  RequestMethod.POST)
	public String updateItem(@ModelAttribute("item") Item item, HttpSession session){ 
		
		System.out.println("Order item is: " + item.getOrderItem());
		
		Customer customer = (Customer)session.getAttribute("customer");
		
		item.setCustomer(customer);
		
		itemService.save(item);
		
		return "addItem";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody List <Product> findAllProducts(){
		return itemService.findAllProducts();
	}

}

	