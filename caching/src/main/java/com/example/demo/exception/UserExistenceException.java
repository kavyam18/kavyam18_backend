package com.example.demo.exception;

public class UserExistenceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserExistenceException(String message) {
		super(message);
	}
}
