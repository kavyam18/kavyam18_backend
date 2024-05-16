package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MartialStatus {

	SINGAL("SINGAL"),MARRIED("MARIED"),DIVORCED("DIVORCED"),WIDOW("WIDOW");
	
	private final String martialStatus;
}
