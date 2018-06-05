package com.kuhn.service;

import java.util.List;

import com.kuhn.entity.Customer;
import com.kuhn.enums.CustomerType;

public interface CustomerService {
	public List<Customer> getAll();
	
	public double calculerRabais(CustomerType customerType, double valeurTotale);
}
