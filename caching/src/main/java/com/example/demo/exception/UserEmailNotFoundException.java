package com.example.demo.exception;

public class UserEmailNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserEmailNotFoundException(String message) {
		super(message);
	}

}
