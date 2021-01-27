package com.bankapp.service;

import java.util.List;

import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;

public interface CustomerService {
	public List<Customer> getAll();
	Customer addCustomer(Customer customer);
	public Customer delete(int id);
	Customer findByName(String name);
	
}