package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Nationality {

	INDIAN("INDIAN"),OTHERS("OTHERS");
	
	private final String nationality;
}
