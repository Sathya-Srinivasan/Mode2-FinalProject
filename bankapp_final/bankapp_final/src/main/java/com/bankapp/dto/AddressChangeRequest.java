package com.bankapp.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@NoArgsConstructor

public class AddressChangeRequest {
	private String address;
	private String city;
	private String phone;
	private String email;
	
	public AddressChangeRequest(String address, String city, String phone, String email) {
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}
	
	

}
