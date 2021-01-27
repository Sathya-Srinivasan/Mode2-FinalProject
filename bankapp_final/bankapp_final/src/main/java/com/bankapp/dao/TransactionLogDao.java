package com.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.bankapp.entities.TransactionLog;
@Repository
public interface TransactionLogDao extends JpaRepository<TransactionLog, Integer>{

	public List<TransactionLog> findByFromAccount(int fromAccount);
	public List<TransactionLog> findByToAccount(int toAccount);
}

