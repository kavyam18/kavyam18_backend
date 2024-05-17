package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeStatus {

	ACTIVE("ACTIVE"),TERMINATED("TERMINATED"),APSACNED("APSCANED");
	
	private final String employeeStatus;
	
}
