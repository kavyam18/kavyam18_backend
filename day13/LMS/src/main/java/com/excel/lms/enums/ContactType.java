package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContactType {

	PERSONAL("PERSONAL"),OFFICAL("OFFICAL");
	
	public final String contactType;
}
