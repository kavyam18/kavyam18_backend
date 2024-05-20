package com.excel.lms.service;

import com.excel.lms.dto.AddressDtoList;
import com.excel.lms.dto.BankDTO;
import com.excel.lms.dto.ContactDtoList;
import com.excel.lms.dto.EducationDTO;
import com.excel.lms.dto.EducationDtoList;
import com.excel.lms.dto.ExperienceDtoList;
import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.dto.SecondaryDTO;
import com.excel.lms.dto.TechnicalDtoList;

public interface EmployeeService {

	public String savePrimaryInfo(PrimaryDTO pDto);

	String saveSecondaryInfo(SecondaryDTO sdto);

	public String saveBankInfo(BankDTO dto);
		
	public String saveEducationInfo(EducationDtoList edto);

	public String saveAddressInfo(AddressDtoList dto);

	public String saveContactInfo(ContactDtoList dto);

	public String saveExperienceInfo(ExperienceDtoList dto);

	public String saveTechnicalInfo(TechnicalDtoList dto);
		
}
