package com.excel.lms.entity;

import com.excel.lms.enums.MartialStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer secondId;
	
	@Column(name = "panNo",length = 6,nullable = true)
	private String panNo;
	
	@Column(name = "aadharNo",length = 12,unique = true)
	private Integer aadharNo;
	
	@Column(name = "fatherName")
	private String fatherName;
	
	@Column(name = "motherName")
	private String motherName;
	
	@Column(name = "spouseName")
	private String spouseName;
	
	@Column(name = "passPortNo",length = 6,unique = true)
	private String passPortNo;
	
	@Enumerated(EnumType.STRING)
	private MartialStatus martialStatus;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;

	
}
