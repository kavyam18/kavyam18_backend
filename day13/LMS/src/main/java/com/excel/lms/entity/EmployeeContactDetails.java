package com.excel.lms.entity;

import java.time.LocalDate;

import com.excel.lms.enums.ContactType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "employee_contact_info")
public class EmployeeContactDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String contactId;
	
	@Enumerated(EnumType.STRING)
	private ContactType contactType;
	
	@Column(name = "contactNumber",length = 10,unique = true,updatable = true)
	private Integer contactNumber;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
