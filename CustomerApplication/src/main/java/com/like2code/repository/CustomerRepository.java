package com.like2code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.like2code.model.Customer;
import com.like2code.model.ShoppingReport;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query("Select new com.like2code.model.ShoppingReport(c.firstName, c.lastName, i.orderItem, i.product, i.quantity, i.price)" + 
			"from Customer c, Item i where c.customerId = i.customerId")
	
	List<ShoppingReport> findAllShoppingReports();

}
