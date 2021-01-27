package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.AuthResponse;
import com.bankapp.entities.Account;
import com.bankapp.entities.Customer;
import com.bankapp.service.AccountService;

@RestController
public class AccountRestController {

	private AccountService accountService;

	@Autowired
	public AccountRestController(AccountService accountService) {
		this.accountService = accountService;
	}

//	@GetMapping(produces = "application/json")
//	@RequestMapping({ "/validateLogin" })
//	public AuthResponse validateLogin() {
//		return new AuthResponse("User successfully authenticated");
//	}

	@GetMapping(path = "account", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> allAccounts() {
		return accountService.getAll();
	}

	@GetMapping(path = "account/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAccountId(@PathVariable(name = "id") int id) {
		return accountService.getAccountId(id);
	}

	@PostMapping(path = "account", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Account addAccount(@RequestBody Account account) {
		return accountService.save(account);
	}

//	@PutMapping(path = "account/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public Account updateAccount(@PathVariable(name = "id") int id, @RequestBody Account acc) {
//		return accountService.update(id, cust);
//
//	}

	@DeleteMapping(path = "account/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account deleteEmplloyee(@PathVariable(name = "id") int id) {
		return accountService.delete(id);
	}
}