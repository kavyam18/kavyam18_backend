package com.myapp.spring.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.myapp.spring.exception.CustomerExistenceException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomerExistenceException.class)
	private ResponseEntity<String> handleCustomerExistenceException(CustomerExistenceException ex){
		return ResponseEntity.status(HttpStatus.IM_USED).body(ex.getMessage());
	}
}
