package com.like2code.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public Customer save(Customer customer) {
		
		em.persist(customer);
		
		em.flush();
		
		return null;
	}

	public List<Customer> loadAll() {
//		Query query = em.createQuery("Select c from Customer c");
		
		TypedQuery<Customer> query = em.createNamedQuery(Customer.FIND_ALL_CUSTOMERS, Customer.class);
		
		return query.getResultList();
	}

	public List<ShoppingReport> findAllShoppingReports() {
//		Query query = em.createQuery("Select new com.like2code.model.ShoppingReport(c.firstName, c.lastName, i.orderItem, i.product, i.quantity, i.price)" + 
//					"from Customer c, Item i where c.customerId = i.customerId");
		TypedQuery<ShoppingReport> query = em.createNamedQuery(Customer.FIND_SHOPPING_REPORTS, ShoppingReport.class);
		
		return query.getResultList();
	}

}
