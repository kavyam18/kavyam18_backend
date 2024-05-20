package com.excel.lms.dto;

import com.excel.lms.enums.MartialStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SecondaryDTO {

    private String secondId;
    
	private String employeeId;
	
	private String panNo;
	
	private Integer aadharNo;
	
	private String fatherName;

	private String motherName;
	
	private String spouseName;

	private String passPortNo;

	private MartialStatus martialStatus;

}
