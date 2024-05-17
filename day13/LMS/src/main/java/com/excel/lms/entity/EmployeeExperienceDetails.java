package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Table(name = "employee_experience_info")
public class EmployeeExperienceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String experienceId;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "yearOfExperience")
	private Integer yearOfExperience;
	
	@Column(name = "dateOfJoining")
	private LocalDate dateOfJoining;
	
	@Column(name = "dateOfRelieving")
	private LocalDate dateOfRelieving;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	@Column(name = "location")
	private String location;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private EmployeePrimaryInfo employeePrimaryInfo;
	
}
