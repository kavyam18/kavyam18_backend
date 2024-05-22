package com.excel.hms.Util;

import com.excel.hms.dto.AdminDTO;
import com.excel.hms.entity.Admin;

public class AdminUtil {

	public AdminUtil() {
		
	}
	
	public static Admin dtoToEntity(AdminDTO dto) {
		return Admin.builder().adminId(dto.getAdminId()).adminNo(dto.getAdminNo()).adminName(dto.getAdminName()).password(dto.getPassword()).roleType(dto.getRoleType()).build();
	}

	public static Admin updatepassword(Admin password, AdminDTO dto) {
		password.setPassword(dto.getPassword());
		return password;
	}

	public static AdminDTO dtoToEntity(Admin save) {
		
		return AdminDTO.builder().adminId(save.getAdminId()).adminName(save.getAdminName()).password(save.getPassword()).roleType(save.getRoleType()).build();
	}

	public static AdminDTO dtoToGetEntity(Admin admin) {
	
		return AdminDTO.builder().adminId(admin.getAdminId()).adminNo(admin.getAdminNo()).adminName(admin.getAdminName())
				.password(admin.getPassword()).roleType(admin.getRoleType()).build();
	}
	
}
