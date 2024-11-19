package com.myapp.spring.exception;

public class AccountExistenceException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountExistenceException(String message) {
		super(message);
	}
}
