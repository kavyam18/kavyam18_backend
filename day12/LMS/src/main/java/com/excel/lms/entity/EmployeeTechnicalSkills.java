package com.excel.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_technical_skills_info")
public class EmployeeTechnicalSkills {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer technicalId;
	
	@Column(name = "skillType")
	private String skillType;
	
	@Column(name = "yearOfExperience")
	private double yearOfExperience;
	
	@Column(name = "skillRating")
	private String skillRating;
}
