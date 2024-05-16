package com.excel.lms.entity;

import com.excel.lms.enums.AccountType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "employee_bank_details")
public class EmployeeBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;
	
	@Column(name = "accountNo",length = 15,unique = true)
	private Integer accountNo;
	
	@Column(name = "bankName")
	private String bankName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@Column(name = "ifscCode")
	private String ifscCode;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "state")
	private String state;
	

}
