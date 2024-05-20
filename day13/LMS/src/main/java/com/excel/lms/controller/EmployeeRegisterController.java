package com.excel.lms.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.AddressDtoList;
import com.excel.lms.dto.BankDTO;
import com.excel.lms.dto.ContactDtoList;
import com.excel.lms.dto.EducationDtoList;
import com.excel.lms.dto.ExperienceDtoList;
import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.dto.SecondaryDTO;
import com.excel.lms.dto.TechnicalDtoList;
import com.excel.lms.response.SuccessResponse;
import com.excel.lms.service.EmployeeService;

@RequestMapping(path="/api/v1/employee")
@RestController
public class EmployeeRegisterController {
	
	@Autowired
	private EmployeeService employeService;
	
     @GetMapping(path = "/get")
     public PrimaryDTO get() {
    	 return PrimaryDTO.builder().dateOfJoining(LocalDate.now()).build();
     }
     @PostMapping(path="/pinfo")
 	public ResponseEntity<SuccessResponse<String>>postPrimaryInfo(@RequestBody PrimaryDTO dto) {
 		String primaryId = employeService.savePrimaryInfo(dto);
 		
 		return ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse.<String>builder().data(primaryId).message("Employee Info Saved").build());
 	}
	
	@PostMapping(path="/sinfo")
	public ResponseEntity<SuccessResponse<String>>postSecondaryInfo(@RequestBody SecondaryDTO dto){
		String secondaryId = employeService.saveSecondaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse.<String>builder().data(secondaryId).message("Employee Secondary Info Saved").build());
	}
	@PostMapping(path="/binfo")
	public ResponseEntity<SuccessResponse<String>>postBankInfo(@RequestBody BankDTO dto){
		String bankId = employeService.saveBankInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(SuccessResponse.<String>builder().data(bankId).message("Employee Bank Info Saved").build());
	}
	@PostMapping(path="/einfo")
	public ResponseEntity<SuccessResponse<String>>postEducationInfo(@RequestBody EducationDtoList dto){
		String eduId = employeService.saveEducationInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(eduId).isError(false).message("Employee Education Info Saved").build());
	}
	@PostMapping(path="/ainfo")
	public ResponseEntity<SuccessResponse<String>>postAddressInfo(@RequestBody AddressDtoList dto){
	    String addId = employeService.saveAddressInfo(dto);
	    return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(addId).isError(false).message("Employee Address Info Saved").build());
    }
	@PostMapping(path="/cinfo")
	public ResponseEntity<SuccessResponse<String>>postContactInfo(@RequestBody ContactDtoList dto){
		String cId = employeService.saveContactInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(cId).isError(false).message("Employee Contact Info Saved").build());
	}
	@PostMapping(path = "exinfo")
	public ResponseEntity<SuccessResponse<String>>postExperienceInfo(@RequestBody ExperienceDtoList dto){
		String exId = employeService.saveExperienceInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(exId).isError(false).message("Employee Experience Info Saved").build());
	}
	@PostMapping(path ="tinfo")
	public ResponseEntity<SuccessResponse<String>>postTechnicalSkillsInfo(@RequestBody TechnicalDtoList dto){
		String tId = employeService.saveTechnicalInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(SuccessResponse.<String>builder().data(tId).isError(false).message("Employee Technical Skills Info Added").build());
	}
}