package com.like2code.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.like2code.model.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public Customer save(Customer customer) {
		
		em.persist(customer);
		
		em.flush();
		
		return null;
	}

}
