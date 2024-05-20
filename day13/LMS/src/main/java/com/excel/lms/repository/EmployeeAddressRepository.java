package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeAddressDetails;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddressDetails, Integer> {

}
