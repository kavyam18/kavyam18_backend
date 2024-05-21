package com.excel.hms.dto;

import com.excel.hms.enums.RoleType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDTO {
	
	private Integer adminNo;

    private String adminId;
	
	private String password;
	
	private String adminName;
	
	private RoleType roleType;

}
