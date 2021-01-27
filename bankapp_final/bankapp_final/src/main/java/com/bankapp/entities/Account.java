package com.bankapp.entities;

import java.time.LocalDate;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Data 
@Getter
@Setter 
@Entity
@Table(name = "account_table")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountId;
	private String name;
	private double balance;
	private LocalDate accountCreationDate;
	private String accountType; //SA,CA
	private String address;
	private String city;
	private String phone;
	private String email;
	private String password;
	private LocalDate dob;
	

	@JsonIgnore
	@JoinColumn(name = "accountId_fk", nullable=false)
    @OneToMany(cascade=CascadeType.ALL)
	private List<TransactionLog> transactionLogs =new ArrayList<>();

	public Account(String name, double balance, String accountType, String address, String city, String phone,
			String email, LocalDate dob) {
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.accountCreationDate=LocalDate.now();
	}
	
	
	
	
//    @JoinColumn(name ="accid_fk")
//	
//	@ManyToOne
//	private Customer customer;
//	
//
//	public void setName(String name) {
//		customer.setName(name);
//		
//	}
//	
//	public void setAge(int age) {
//		customer.setAge(age);
//		
//	}
	
	
}
