package com.kuhn.entity;

public class Customer {
	
	private String Name;
	
	private String Email;

	public Customer(String name, String email) {
		Name = name;
		Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
