package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;
import com.excel.lms.enums.Nationality;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer primaryId;
	
	private String employeeId;
	
	
	@Column(name = "name")
	private String employeeName;
	
	@Column(name = "dateofJoining")
	private LocalDate dateOfJoining;
	
	@Column(name = "dateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "emailId",unique = true,updatable = true)
	private String emailId;
	
	@Column(name = "bloodGroup")
	private String bloodGroup;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private Nationality nationality;
	
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "employeePrimaryInfo" )
	private List<EmployeeAddressDetails > employeeAddressDetails;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employeePrimaryInfo")
	private EmployeeBankDetails employeeBankDetails;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employeePrimaryInfo")
	private List<EmployeeContactDetails> employeeContactDetails;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employeePrimaryInfo")
	private List<EmployeeEducationDetails> employeeEducationDetails;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employeePrimaryInfo")
	private List<EmployeeExperienceDetails> employeeExperienceDetails;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employeePrimaryInfos")
	private List<EmployeeTechnicalSkills> employeeTechnicalSkills;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employeePrimaryInfo")
    private EmployeeSecondaryInfo employeeSecondaryInfo;

	
	
	}

