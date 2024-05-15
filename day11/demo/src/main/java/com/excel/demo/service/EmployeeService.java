package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public interface EmployeeService {

	EmployeeDto addEmployee(EmployeeDto employee);

	List<EmployeeDto> getAllEmployees();

	void deleteDepartmentById(int employeeId) ;

}
