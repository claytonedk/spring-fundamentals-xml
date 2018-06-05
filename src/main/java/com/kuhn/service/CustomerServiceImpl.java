package com.kuhn.service;

import java.util.List;
import java.util.Map;

import com.kuhn.entity.Customer;
import com.kuhn.enums.CustomerType;
import com.kuhn.log.Log;
import com.kuhn.repository.CustomerRepository;
import com.kuhn.strategy.discount.DiscountCalc;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	private Log log;
	private List<Log> logs;
	private Map<CustomerType, DiscountCalc> discounts;
	
	public CustomerServiceImpl(CustomerRepository customerRepository,
							   Log log,
							   List<Log> logs,
							   Map<CustomerType, DiscountCalc> discounts) {
		super();
		System.out.println("Constructor");
		this.customerRepository = customerRepository;
		this.log = log;
		this.logs = logs;
		this.discounts = discounts;
	}
	
	public CustomerServiceImpl() {
		super();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getAll() {
		log.log("CustomerService.getAll()");
		
		logs.forEach((v) -> v.log("CustomerService.getAll()"));
		
		return customerRepository.getAll();
	}

	@Override
	public double calculerRabais(CustomerType customerType, double valeurTotale) {
		return discounts.get(customerType).calculateDiscount(valeurTotale);
	}
}
