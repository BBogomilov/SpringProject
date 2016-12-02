package com.bogi.repository;

import java.util.List;

import com.bogi.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}