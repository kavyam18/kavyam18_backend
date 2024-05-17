package com.excel.lms.exception;

public class EmployeeExistanceException extends RuntimeException {

	public static final long serialVersionUID = 1L;
	
	public  EmployeeExistanceException(String message) {
		
		super(message);
	}
}
