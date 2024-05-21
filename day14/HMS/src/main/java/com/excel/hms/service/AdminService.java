package com.excel.hms.service;

import java.util.List;

import com.excel.hms.dto.AdminDTO;

public interface AdminService {

	String addAdminInfo(AdminDTO dto);

	String adminLogin(AdminDTO dto);

	AdminDTO updateAdminPassword(AdminDTO dto);

	List<AdminDTO> getAdmin(AdminDTO admin);

	AdminDTO getAdminById(AdminDTO dto);
}
