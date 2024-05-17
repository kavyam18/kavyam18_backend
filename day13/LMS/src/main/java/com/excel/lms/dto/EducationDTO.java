package com.excel.lms.dto;

import java.time.LocalDate;
import com.excel.lms.enums.EducationType;

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
public class EducationDTO {

    private String eduId;

	private EducationType educationType;
	
	private Double percentage;
	
	private String instituteName;
	
	private String state;

	private String universityName;

	private String specialization;

	private LocalDate yearOfPassing;
}
