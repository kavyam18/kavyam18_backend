package com.myapp.spring.exception;

public class CustomerNotFoundException extends NotFoundException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public CustomerNotFoundException(Long id) {
	        super("Customer not found with ID: " + id, "CUSTOMER_NOT_FOUND");
	    }
		public CustomerNotFoundException(String message) {
			super(message);
		}
    }

