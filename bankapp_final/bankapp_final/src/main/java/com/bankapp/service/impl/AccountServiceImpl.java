/*package com.bankapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.TransactionLogDao;
import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;

import lombok.Getter;
import lombok.Setter;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	private TransactionLogDao trasantionLogDao;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao, TransactionLogDao trasantionLogDao) {
		this.accountDao = accountDao;
		this.trasantionLogDao = trasantionLogDao;
	}

	@Override
	public List<Account> getAll() {
		return accountDao.findAll();
	}

	@Override
	public Account getAccountId(int id)  {
		return accountDao.findById(id).
				orElseThrow(() -> new com.bankapp.exceptions.ResourceNotFoundException("account with id "+ id +" not found"));
	}
	
	@Override
	public Account save(Account acc) {
		return accountDao.save(acc);
	}

	@Override
	public Account delete(int accId) {
		Account accountToDelete=getAccountId(accId);
		accountDao.delete(accountToDelete);
		return accountToDelete;
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		Account fromAcc=getAccountId(fromAccountId);
		Account toAcc=getAccountId(toAccountId);
	fromAcc.setBalance(fromAcc.getBalance()-amount);
	toAcc.setBalance(toAcc.getBalance()+amount);
		
		TransactionLog fromAccLog = new TransactionLog("withdraw", fromAccountId, toAccountId, "withdraw");
		
fromAcc.getTransactionLogs().add(fromAccLog);
		
        TransactionLog toAccLog = new TransactionLog("deposit", toAccountId, fromAccountId, "deposit");
		
		toAcc.getTransactionLogs().add(toAccLog);
		
		accountDao.save(fromAcc);
		accountDao.save(toAcc);
	}

	@Override
	public void changeAddress(int Id, AddressChangeRequest request) {
		Account accountToUpdate=getAccountId(Id);
		accountToUpdate.setAddress(request.getAddress());
		accountToUpdate.setCity(request.getCity());
		accountToUpdate.setPhone(request.getPhone());
		accountToUpdate.setEmail(request.getEmail());
		
		accountDao.save(accountToUpdate);
	}

	@Override
	public void deposit(int Id, double amount) {
		Account toDeposit=getAccountId(Id);
	toDeposit.setBalance(toDeposit.getBalance()+amount);
		
        TransactionLog accLog = new TransactionLog("deposit", 0, Id, "deposit");
		
     toDeposit.getTransactionLogs().add(accLog);
		
		accountDao.save(toDeposit);
		
	}

	@Override
	public void withdraw(int Id, double amount) {
		Account toWithdraw=getAccountId(Id);
	//toWithdraw.setBalance(toWithdraw.getBalance()-amount);
		
       TransactionLog accLog = new TransactionLog("withdraw", Id, 0, "withdraw");
		
   // toWithdraw.getTransactionLogs().add(accLog);
		
		accountDao.save(toWithdraw);
		
	}

	@Override
	public boolean isCustomerExist(String username) {
		
		return false;
	}

}
*/
