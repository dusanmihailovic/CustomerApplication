package com.like2code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.like2code.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	public List<Product> findAllProducts(){
		
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

}
