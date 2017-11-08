package com.like2code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.like2code.model.Item;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Long>{
		
}
