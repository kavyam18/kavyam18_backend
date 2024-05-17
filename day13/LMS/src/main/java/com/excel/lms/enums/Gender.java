package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Gender {

	FEMALE("FEMALE"),MALE("MALE"),OTHERS("OTHERS");
	
	private final String genderType;
	
}
