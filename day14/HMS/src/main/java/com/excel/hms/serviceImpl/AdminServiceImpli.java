package com.excel.hms.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.hms.Util.AdminUtil;
import com.excel.hms.Util.StaffUtil;
import com.excel.hms.dto.AdminDTO;
import com.excel.hms.dto.StaffDTO;
import com.excel.hms.entity.Admin;
import com.excel.hms.entity.Staff;
import com.excel.hms.exception.AdminExistenceException;
import com.excel.hms.repository.AdminRepository;
import com.excel.hms.repository.StaffRepository;
import com.excel.hms.service.AdminService;

@Service
public class AdminServiceImpli implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private StaffRepository staffRepository;
	
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

	@Override
    public String addStaffInfo(StaffDTO staffDto)  {
        if (!isAdmin(staffDto.getAdminNo())) {
            throw new AdminExistenceException("Only admins are allowed to add staff details");
        }
        Staff staff = StaffUtil.dtoToEntity(staffDto);
        if (!staffRepository.findByStaffId(staffDto.getStaffId()).isPresent()) {
            Staff savedStaff = staffRepository.save(staff);
            return savedStaff.getStaffId();
        }
        throw new AdminExistenceException("Staff Id is already present");
    }
    private boolean isAdmin(Integer adminNo) {
        Optional<Admin> adminOptional = adminRepository.findById(adminNo);
       return adminOptional.isPresent();
    }

	@Override
	public StaffDTO updateStaffPassword(StaffDTO dto) {
	  if(!isAdmin(dto.getAdminNo())) {
		  throw new AdminExistenceException("Only Admins Can Update Staff Password");
	  }
		Optional<Staff> optional = staffRepository.findByStaffId(dto.getStaffId());
		if(optional.isPresent()) {
			Staff password = optional.get();
			password = StaffUtil.updatePassword(password,dto);
			Staff save = staffRepository.save(password);
			return StaffUtil.dtoToEntity(save);
	}
	throw new AdminExistenceException("Password is Not Valid!");
  }

	@Override
	public String deleteStaff(StaffDTO dto) {
		if(!isAdmin(dto.getAdminNo())) {
			throw new AdminExistenceException("Only Admins Can Delete Staff Info ");
		}
		Optional<Staff> optional = staffRepository.findByStaffId(dto.getStaffId());
		if(optional.isPresent()) {
			staffRepository.delete(optional.get());
			return "Staff Deleted Succesfully!!";
		}
		throw new AdminExistenceException("Staff Id not Found!");
	}
	
}
