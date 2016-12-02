package com.bogi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bogi.model.Customer;
import com.bogi.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection !");
		this.customerRepository = customerRepository;
	}
}
