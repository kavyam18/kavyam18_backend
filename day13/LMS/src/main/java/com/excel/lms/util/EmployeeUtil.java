package com.excel.lms.util;

import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.entity.EmployeePrimaryInfo;

public class EmployeeUtil {

	public EmployeeUtil() {
		
	}

	public static EmployeePrimaryInfo dtoToEntity(PrimaryDTO pDto) {
		
		return EmployeePrimaryInfo.builder().primaryId(pDto.getPrimaryId()).employeeName(pDto.getEmployeeName()).dateOfJoining(pDto.getDateOfJoining())
				.dateOfBirth(pDto.getDateOfBirth()).emailId(pDto.getEmailId()).gender(pDto.getGender()).designation(pDto.getDesignation())
				.employeeStatus(pDto.getEmployeeStatus()).nationality(pDto.getNationality()).bloodGroup(pDto.getBloodGroup()).build();
	}
	
}
