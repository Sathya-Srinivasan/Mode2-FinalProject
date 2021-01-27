package com.bankapp.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1125934271375428316L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}