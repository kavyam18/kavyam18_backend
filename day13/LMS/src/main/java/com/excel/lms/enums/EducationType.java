package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {

	PRIMARYEDU("PRIMARYEDUCATION"),SECONDARYEDU("SECONDARYEDUCATION"),
	GRADUATION("GRADUATION"),POSTGRADUATION("POSTGRADUATION"),OTHERS("OTHERS");
	
	private final String educationType;
	
}
