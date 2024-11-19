package com.myapp.spring.dto;

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
public class CustomerDto {

	Long id;
	
	String name;
	
	String email;
	
	Long phoneNumber;
	
	String address;
	
    AccountDto account;
}