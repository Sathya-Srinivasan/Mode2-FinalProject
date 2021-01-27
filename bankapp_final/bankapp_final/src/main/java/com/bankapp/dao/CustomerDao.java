package com.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.bankapp.entities.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	Customer findByName(String name);
}

