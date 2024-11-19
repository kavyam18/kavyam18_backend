package com.myapp.spring.exception;

public class CustomerExistenceException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerExistenceException(String message) {
		super(message);
	}

}
