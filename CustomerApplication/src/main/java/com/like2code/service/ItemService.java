package com.like2code.service;

import java.util.List;

import com.like2code.model.Item;
import com.like2code.model.Product;

public interface ItemService {
	
	List<Product> findAllProducts();

	Item save(Item item);

}
