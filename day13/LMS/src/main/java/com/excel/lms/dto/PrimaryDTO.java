package com.excel.lms.dto;

import java.time.LocalDate;
import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;
import com.excel.lms.enums.Nationality;

import jakarta.persistence.Entity;
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
public class PrimaryDTO {


	private String primaryId;
	
	private String employeeName;
	
	private LocalDate dateOfJoining;
	
	private LocalDate dateOfBirth;
	
	private String emailId;

	private String bloodGroup;

	private Designation designation;
	
	private Gender gender;
	
	private Nationality nationality;
	
	private EmployeeStatus employeeStatus;
}
