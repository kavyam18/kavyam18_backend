package com.excel.lms.dto;

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
public class TechnicalDTO {

    private String technicalId;
	
	private String skillType;
	
	private double yearOfExperience;
	
	private String skillRating;
}
