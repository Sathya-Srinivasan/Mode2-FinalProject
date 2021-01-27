package com.bankapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dao.CustomerDao;
import com.bankapp.entities.Customer;
import com.bankapp.exceptions.ResourceNotFoundException;
import com.bankapp.service.CustomerService;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	 
	private CustomerDao customerDao; 
	
	@Autowired
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getAll() {
		return customerDao.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public Customer delete(int id) {
		Customer cust = customerDao.findById(id).orElseThrow
				(() -> new ResourceNotFoundException("user with id: "+ id +"is not found"));
		customerDao.delete(cust);
		return cust;
	
	}

	@Override
	public Customer findByName(String name) {
		return customerDao.findByName(name);
	}

}
