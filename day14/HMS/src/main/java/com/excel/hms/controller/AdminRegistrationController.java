package com.excel.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.hms.dto.AdminDTO;
import com.excel.hms.response.SuccessResponse;
import com.excel.hms.service.AdminService;




@RequestMapping(path = "/api/v1/hotel")
@RestController
public class AdminRegistrationController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/register")
	public ResponseEntity<SuccessResponse<String>>postAdminInfo(@RequestBody AdminDTO dto){
		String adminId = adminService.addAdminInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse.<String>builder().data(adminId).isError(false).message("Admin Registered Successfully").build());	
	}
	
	@PostMapping("/login")
	public ResponseEntity<SuccessResponse<String>>postAdminLogin(@RequestBody AdminDTO dto){
		String adminName = adminService.adminLogin(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(adminName).isError(false).message("Admin Login Succesfully").build());	
	}
	@PutMapping("/update")
	public ResponseEntity<SuccessResponse<AdminDTO>> updateAdminPassword(@RequestBody AdminDTO dto){
		AdminDTO adminPass = adminService.updateAdminPassword(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<AdminDTO>builder().data(adminPass).isError(false).message("Password updated successfully").build());
	}
	@GetMapping("/getAll")
	public ResponseEntity<SuccessResponse<List<AdminDTO>>>fetchAllAdminInfo(@RequestBody AdminDTO admin){
		List<AdminDTO> dto = adminService.getAdmin(admin);
		return ResponseEntity.status(HttpStatus.OK).body(SuccessResponse.<List<AdminDTO>>builder().data(dto).isError(false).message("Successfully Fetch All Admins").build());
	}
	@GetMapping("/getById")
	public ResponseEntity<SuccessResponse<AdminDTO>>fetchById(@RequestBody AdminDTO dto){
		AdminDTO admin = adminService.getAdminById(dto);
		return ResponseEntity.status(HttpStatus.OK).body(SuccessResponse.<AdminDTO>builder().data(admin).isError(false).message("Fetch Admin By id Successfully!").build());
	}
}
