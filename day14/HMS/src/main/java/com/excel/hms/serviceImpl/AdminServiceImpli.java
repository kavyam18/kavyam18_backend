package com.excel.hms.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.hms.Util.AdminUtil;
import com.excel.hms.dto.AdminDTO;
import com.excel.hms.entity.Admin;
import com.excel.hms.exception.AdminExistenceException;
import com.excel.hms.repository.AdminRepository;
import com.excel.hms.service.AdminService;

@Service
public class AdminServiceImpli implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public String addAdminInfo(AdminDTO dto) {
		Admin admin = AdminUtil.dtoToEntity(dto);
		
		if(!adminRepository.findByAdminName(dto.getAdminName()).isPresent()) 
		{
			Admin save = adminRepository.save(admin);
			return save.getAdminId();
		}
		throw new AdminExistenceException("Admin name is already present");
	}

	@Override
	public String adminLogin(AdminDTO dto) {
       Optional<Admin> optional = adminRepository.findByAdminName(dto.getAdminName());
       if (optional.isPresent()) {
           Admin admin = optional.get();
           if (admin.getPassword().equals(dto.getPassword())) {
               return admin.getRoleType().getRoleType();
           } else {
               throw new AdminExistenceException("Invalid Password!");
           }
       }
       throw new AdminExistenceException("Invalid Username!");
   }

	@Override
	public AdminDTO updateAdminPassword(AdminDTO dto) {
        Optional<Admin> optional = adminRepository.findByAdminId(dto.getAdminId());
        if(optional.isPresent()) {
        	Admin password = optional.get();
        	password = AdminUtil.updatepassword(password,dto);
        	Admin save = adminRepository.save(password);
        	return AdminUtil.dtoToEntity(save);
        }
		throw new AdminExistenceException("Password is Not Valid!");
	}

	@Override
	public List<AdminDTO> getAdmin(AdminDTO admin) {
		return adminRepository.findAll().stream().map(x->AdminDTO.builder().adminId(x.getAdminId()).adminNo(x.getAdminNo()).adminName(x.getAdminName()).password(x.getPassword()).roleType(x.getRoleType()).build()).toList();
	}

	@Override
	public AdminDTO getAdminById(AdminDTO dto) {
     Optional<Admin> optional = adminRepository.findByAdminId(dto.getAdminId());
     if(optional.isPresent()) {
    	 Admin admin = optional.get();
    	 return AdminUtil.dtoToGetEntity(admin);
     }else {
		throw new AdminExistenceException("Employee Id Not Found");
	}
	}
	
}
