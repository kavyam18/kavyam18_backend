package com.myapp.spring.exception;

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String errorCode;

    public BaseException(String message) {
        super(message);
        this.errorCode = null;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
    }

    public BaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
