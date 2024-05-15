package com.excel.springjdbc;

import java.util.List;

public interface EmployeeDao {

	int insertEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(Employee employee);

	List<Employee> getAllEmployee();

}