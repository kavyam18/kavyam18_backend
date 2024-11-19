package com.myapp.spring.exception;

public class NotFoundException extends BaseException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(String message, String errorCode) {
        super(message, errorCode);
    }

	public NotFoundException(String message) {
		super(message);
	}

}
