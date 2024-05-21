package com.excel.hms.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdminExceptionHandler {

	@ExceptionHandler(AdminExistenceException.class)
	private ResponseEntity<String> adminAlreadyExist(RuntimeException exe){
		return ResponseEntity.ok(exe.getMessage());
	}
		
	
	
}
