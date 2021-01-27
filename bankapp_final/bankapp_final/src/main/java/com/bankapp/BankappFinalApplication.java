package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dao.TransactionLogDao;
import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;
import com.bankapp.service.CustomerService;

@SpringBootApplication
public class BankappFinalApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionLogDao transactionLogDao;
	
	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(BankappFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		
		Customer cust= new Customer("suji", "suji123", "admin", "abc",
				"abc", "995678129", "suji@s.com", LocalDate.of(1999, Month.OCTOBER, 01));
		Customer cust1= new Customer("mohan", "mohan123", "mgr", "abc",
				"abc", "985678129", "mohan@s.com", LocalDate.of(2000, Month.AUGUST, 28));
		
		customerService.addCustomer(cust);
		customerService.addCustomer(cust1);
		
		Account account1 = new Account("suji", 1000.00 , "saving", "mgbrothes col", "abc", "4522896463", "suji@s.com", LocalDate.of(1980,Month.OCTOBER, 01));
		
		Account account2 = new Account("mohan", 1000.00 , "saving", "gandhinagar col", "abc", "4522896463", "mohan@s.com", LocalDate.of(1982,Month.AUGUST, 28));
		
		accountService.save(account1);
		accountService.save(account2);
		
		accountService.transfer(1, 2, 100);
		accountService.deposit(1, 100);
		accountService.withdraw(2, 100);
		
		AddressChangeRequest addressChangeRequest = new AddressChangeRequest("raj", "abc", "55654856", "suji@s.com");
		
		accountService.changeAddress(1, addressChangeRequest);//		
		List<TransactionLog> list = transactionLogDao.findByFromAccount(2);
	
for(TransactionLog log:list)
		System.out.println(log);
	}

}
