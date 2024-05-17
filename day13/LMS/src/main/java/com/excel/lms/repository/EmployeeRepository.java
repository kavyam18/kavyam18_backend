package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeePrimaryInfo;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, String> {
	
    Optional<EmployeePrimaryInfo> findByPrimaryId(String primaryId);
	
}
