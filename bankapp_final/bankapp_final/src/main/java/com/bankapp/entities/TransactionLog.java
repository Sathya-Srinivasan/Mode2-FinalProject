package com.bankapp.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Data 
@Getter
@Setter
@ToString
@Entity
@Table(name = "transactionLog_table")
public class TransactionLog {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int txLogId;
	private String type;
	private int fromAccount;
	private int toAccount;
	private String transactionDetails;
	private LocalDateTime timestamp;
	private String status;
	
	public TransactionLog(String type, int fromAccount, int toAccount, String transactionDetails) {
		this.type = type;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionDetails = transactionDetails;
		this.timestamp = LocalDateTime.now();
		this.status="successful";
	}
	
	

}
