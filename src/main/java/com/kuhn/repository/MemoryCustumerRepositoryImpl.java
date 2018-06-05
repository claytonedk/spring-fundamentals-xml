package com.kuhn.repository;

import java.util.Arrays;
import java.util.List;

import com.kuhn.entity.Customer;

public class MemoryCustumerRepositoryImpl implements CustomerRepository {

	private List<Customer> customers;
	
	public MemoryCustumerRepositoryImpl() {
		customers = Arrays.asList(
				new Customer("Clayton Kuhn", "claytonedk@gmail.com"),
				new Customer("Ana Zattar", "ana_zattar@hotmail.com")
		);
	}



	public List<Customer> getAll() {
		return customers;
	}

}
