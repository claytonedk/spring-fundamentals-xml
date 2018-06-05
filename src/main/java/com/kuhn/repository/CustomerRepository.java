package com.kuhn.repository;

import java.util.List;

import com.kuhn.entity.Customer;

public interface CustomerRepository {
	
	public List<Customer> getAll();
	
}
