package com.bankapp.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data//@Getter,@Setter ect....
@Entity
@Table(name = "cust_table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	private String name;
	private String password;
	private String profile;	
	private String address;
	private String city;
	private String phone;
	private String email;	
	private LocalDate dob;
	
	public Customer(String name, String password, String profile, String address, String city, String phone,
			String email, LocalDate dob) {
		this.name = name;
		this.password = password;
		this.profile = profile;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}
	
	
	
	

}
