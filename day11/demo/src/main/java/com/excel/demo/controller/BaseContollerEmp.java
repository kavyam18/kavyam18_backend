package com.excel.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.service.EmployeeService;

@RestController
public class BaseContollerEmp {
	
		@Autowired
		private EmployeeService employeeService;

		@GetMapping("/home")
		public ResponseEntity<String> homeGetReq() {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
		}
		
		@PostMapping("/add") 
		public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee) {
			EmployeeDto dto1 = employeeService.addEmployee(employee);
			return ResponseEntity.status(HttpStatus.OK).body(dto1);
		}
		@DeleteMapping("/delete")
		public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto){
			 employeeService.deleteEmployee(dto);
			return ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS);
		}
	
       @GetMapping("/getAll")
       public ResponseEntity<List<EmployeeDto>> fetchAllEmployees(){
    	   return ResponseEntity.ok(employeeService.getAllEmployees());
       }
	}


