package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeContactDetails;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContactDetails, Integer> {

}
