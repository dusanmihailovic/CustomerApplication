package com.like2code.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.like2code.model.Item;

@Repository("itemRepository")
public class ItemRepositoryImpl implements ItemRepository {
	
	@PersistenceContext
	private EntityManager em;

	public Item save(Item item) {
		
		em.persist(item);
		
		em.flush();
		
		return item;
	}

}
