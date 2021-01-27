package com.bankapp.service;

import java.util.List;

import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;

public interface TransationLogService {
	
	public List<Account> getAllAccounts();
//	public void deposit(int accountId, double amount);
//	public void withdraw(int accountId, double amount);
//	public void transfer(int fromAccountId, int toAccountId, double amount);
	
	//public boolean isCustomerExist(String username);
	
	
	public Account save(Account account);
	public Account update(int id, Customer cust);
	public Account delete(int id);

	public Account getAccountById(int accountId);

	public List<Account> getAll();
	
}