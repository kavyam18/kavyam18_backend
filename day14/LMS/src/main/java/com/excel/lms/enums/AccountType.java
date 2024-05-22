package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AccountType {

	SAVINGS("SAVINGS"),CURRENT("CURRENT"),BUSSINESS("BUSSINESS"),OTHERS("OTHERS");
	
	private final String accountType;
}
