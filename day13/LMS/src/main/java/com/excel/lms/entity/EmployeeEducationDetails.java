package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.EducationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "employee_education_info")
public class EmployeeEducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String eduId;
	
	@Enumerated(EnumType.STRING)
	private EducationType educationType;
	
	@Column(name = "percentage")
	private Double percentage;
	
	@Column(name = "instituteName")
	private String instituteName;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "universityName")
	private String universityName;
	
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "yearOfPassing")
	private LocalDate yearOfPassing;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<EmployeePrimaryInfo> employeePrimaryInfo;
}
