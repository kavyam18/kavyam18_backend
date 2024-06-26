package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeePrimaryInfo;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, Integer> {


	Optional<EmployeePrimaryInfo> findByEmployeeId(String employeeId);
	
}
