package com.bogi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bogi.model.Customer;

@Repository("com.bogi")
public class HibernateCustomerRepositoryImpl implements CustomerRepository { 

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Bryan");
		customer.setLastName("Hansen");
		
		customers.add(customer);
		
		return customers;
	}
}
