package com.excel.lms.entity;

import java.time.LocalDate;

import com.excel.lms.enums.AddressType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "employee_address_info")
public class EmployeeAddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
	
	@Column(name = "doorNo")
	private String doorNo;

	@Column(name = "street")
	private String street;
	
	@Column(name = "locality")
	private String locality;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "landMark")
	private String landMark;
	
	@Column(name = "pinCode",length = 6)
	private Integer pinCode;
}
