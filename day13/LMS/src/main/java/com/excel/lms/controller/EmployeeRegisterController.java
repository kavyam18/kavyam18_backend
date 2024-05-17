package com.excel.lms.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.response.SuccessResponse;
import com.excel.lms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path="/api/v1/employee")
@RestController
public class EmployeeRegisterController {
	
	private final EmployeeService employeService;
	
     @GetMapping(path = "/get")
     public PrimaryDTO get() {
    	 return PrimaryDTO.builder().dateOfJoining(LocalDate.now()).build();
     }
     @PostMapping(path="/pinfo")
 	public ResponseEntity<SuccessResponse<String>>postPrimaryInfo(@RequestBody PrimaryDTO dto) {
 		String primaryId = employeService.savePrimaryInfo(dto);
 		
 		return ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse.<String>builder().data(primaryId).message("Employee Info Saved").build());
 	}
	
	
}
