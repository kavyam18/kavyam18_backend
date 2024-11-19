package com.myapp.spring.dto;

import com.myapp.spring.enums.AccountType;

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
public class AccountDto {

	private Long id;
	
	private String accountNumber;
	
	private String bankName;
	
	private AccountType accountType;
	
	private double balance;
}
