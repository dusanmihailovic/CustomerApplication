package com.like2code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like2code.model.Item;
import com.like2code.repository.ItemRepository;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	public Item save(Item item) {
		
		return itemRepository.save(item);
	}

}
