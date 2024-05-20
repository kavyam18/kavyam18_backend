package com.excel.lms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excel.lms.dto.AddressDTO;
import com.excel.lms.dto.BankDTO;
import com.excel.lms.dto.ContactDTO;
import com.excel.lms.dto.EducationDTO;
import com.excel.lms.dto.ExperienceDTO;
import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.dto.SecondaryDTO;
import com.excel.lms.dto.TechnicalDTO;
import com.excel.lms.entity.EmployeeAddressDetails;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeContactDetails;
import com.excel.lms.entity.EmployeeEducationDetails;
import com.excel.lms.entity.EmployeeExperienceDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalSkills;

public class EmployeeUtil {

	public EmployeeUtil() {
		
	}

	public static EmployeePrimaryInfo dtoToEntity(PrimaryDTO pDto) {
		
		return EmployeePrimaryInfo.builder().employeeId(pDto.getEmployeeId()).employeeName(pDto.getEmployeeName()).dateOfJoining(pDto.getDateOfJoining())
				.dateOfBirth(pDto.getDateOfBirth()).emailId(pDto.getEmailId()).gender(pDto.getGender()).designation(pDto.getDesignation())
				.employeeStatus(pDto.getEmployeeStatus()).nationality(pDto.getNationality()).bloodGroup(pDto.getBloodGroup()).build();
	}
	
public static EmployeeSecondaryInfo dtoToEntity(SecondaryDTO sDto) {
		return EmployeeSecondaryInfo.builder().panNo(sDto.getPanNo()).aadharNo(sDto.getAadharNo())
				.fatherName(sDto.getFatherName()).motherName(sDto.getMotherName()).spouseName(sDto.getSpouseName())
				.passPortNo(sDto.getPassPortNo()).martialStatus(sDto.getMartialStatus()).build();
}

public static EmployeeBankDetails dtoToEntity(BankDTO bdto) {
	
	return EmployeeBankDetails.builder().accountNo(bdto.getAccountNo()).bankName(bdto.getBankName()).accountType(bdto.getAccountType())
			.branch(bdto.getBranch()).ifscCode(bdto.getIfscCode()).state(bdto.getState()).build();
}

public static List<EmployeeEducationDetails> dtoToEducationEntity(List<EducationDTO> educations){
	return educations.stream().map(x->EmployeeEducationDetails.builder().educationType(x.getEducationType()).instituteName(x.getInstituteName())
			.state(x.getState()).universityName(x.getUniversityName()).specialization(x.getSpecialization()).yearOfPassing(x.getYearOfPassing())
			.build()).collect(Collectors.toList());
}

public static List<EmployeeAddressDetails> dtoToAddressEntity(List<AddressDTO> address) {
	
	return address.stream().map(x->EmployeeAddressDetails.builder().addressType(x.getAddressType()).doorNo(x.getDoorNo())
			.street(x.getStreet()).locality(x.getLocality()).city(x.getCity()).state(x.getState())
			.landMark(x.getLandMark()).pinCode(x.getPinCode()).build()).collect(Collectors.toList());
			
}

public static List<EmployeeContactDetails> dtoToContactEntity(List<ContactDTO> contact) {
	return contact.stream().map(x->EmployeeContactDetails.builder().contactType(x.getContactType())
			.contactNumber(x.getContactNumber()).build()).collect(Collectors.toList());
}

public static List<EmployeeExperienceDetails> dtoToExperienceEntity(List<ExperienceDTO> experience) {
	return experience.stream().map(x->EmployeeExperienceDetails.builder().companyName(x.getCompanyName()).yearOfExperience(x.getYearOfExperience()).dateOfJoining(x.getDateOfJoining())
			.dateOfRelieving(x.getDateOfRelieving()).designation(x.getDesignation()).location(x.getLocation()).build()).collect(Collectors.toList());
}
public static EmployeeTechnicalSkills dtoToTechnicalEntity(TechnicalDTO skill) 
{
	return EmployeeTechnicalSkills.builder().skillType(skill.getSkillType()).skillRating(skill.getSkillRating())
			.yearOfExperience(skill.getYearOfExperience()).employeePrimaryInfos(new ArrayList<>()).build();

}
}
