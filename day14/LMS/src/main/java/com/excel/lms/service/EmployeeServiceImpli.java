package com.excel.lms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.AddressDtoList;
import com.excel.lms.dto.BankDTO;
import com.excel.lms.dto.ContactDtoList;
import com.excel.lms.dto.EducationDtoList;
import com.excel.lms.dto.ExperienceDtoList;
import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.dto.SecondaryDTO;
import com.excel.lms.dto.TechnicalDtoList;
import com.excel.lms.entity.EmployeeAddressDetails;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeContactDetails;
import com.excel.lms.entity.EmployeeEducationDetails;
import com.excel.lms.entity.EmployeeExperienceDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalSkills;
import com.excel.lms.exception.EmployeeExistanceException;
import com.excel.lms.repository.EmployeeAddressRepository;
import com.excel.lms.repository.EmployeeBankRepository;
import com.excel.lms.repository.EmployeeContactRepository;
import com.excel.lms.repository.EmployeeEducationRepository;
import com.excel.lms.repository.EmployeeExperienceRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.repository.EmployeeTechnicalRepository;
import com.excel.lms.util.EmployeeUtil;

@Service
public class EmployeeServiceImpli implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeSecondaryRepository employeeSecondaryRepository;
	
	@Autowired
	private EmployeeBankRepository employeeBankRepository;
	
	@Autowired
	private EmployeeEducationRepository employeeEducationRepository;
	
	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;
	
	@Autowired
	private EmployeeContactRepository employeeContactRepository;
	
	@Autowired
	private EmployeeExperienceRepository employeeExperienceRepository;
	
	@Autowired
	private EmployeeTechnicalRepository employeeTechnicalRepository;
	
	@Override
	public String savePrimaryInfo(PrimaryDTO pDto) {
		if(!employeeRepository.findByEmployeeId(pDto.getEmployeeId()).isPresent()) {
			EmployeePrimaryInfo employee = EmployeeUtil.dtoToEntity(pDto);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeeExistanceException("Check EmployeeId Entered!!");
	}

	@Override
	public String saveSecondaryInfo(SecondaryDTO sdto) {
	    Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(sdto.getEmployeeId());

	    if (optional.isPresent()) {
	        EmployeePrimaryInfo employee = optional.get();
	        if (employee.getEmployeeSecondaryInfo() == null) {
	            EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeUtil.dtoToEntity(sdto);

	            employee.setEmployeeSecondaryInfo(employeeSecondaryInfo);
	            employeeSecondaryInfo.setEmployeePrimaryInfo(employee);
	            return employeeSecondaryRepository.save(employeeSecondaryInfo).getEmployeePrimaryInfo().getEmployeeId();
	        } else {
	            EmployeeSecondaryInfo secondaryInfo = employee.getEmployeeSecondaryInfo();
	            secondaryInfo.setPanNo(sdto.getPanNo());
	            secondaryInfo.setAadharNo(sdto.getAadharNo());
	            secondaryInfo.setFatherName(sdto.getFatherName());
	            secondaryInfo.setMotherName(sdto.getMotherName());
	            secondaryInfo.setMartialStatus(sdto.getMartialStatus());
	            secondaryInfo.setPassPortNo(sdto.getPassPortNo());
	            secondaryInfo.setSpouseName(sdto.getSpouseName());

	            return employeeSecondaryRepository.save(secondaryInfo).getEmployeePrimaryInfo().getEmployeeId();
	        }
	    }
	    return null;
	}

	@Override
	public String saveBankInfo(BankDTO bdto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(bdto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			if(employee.getEmployeeBankDetails()==null) {
				EmployeeBankDetails employeeBankDetails = EmployeeUtil.dtoToEntity(bdto);
				
				employee.setEmployeeBankDetails(employeeBankDetails);
				employeeBankDetails.setEmployeePrimaryInfo(employee);
				return employeeBankRepository.save(employeeBankDetails).getEmployeePrimaryInfo().getEmployeeId();
			}else {
				EmployeeBankDetails bankInfo = employee.getEmployeeBankDetails();
				bankInfo.setAccountNo(bdto.getAccountNo());
				bankInfo.setAccountType(bdto.getAccountType());
				bankInfo.setBankName(bdto.getBankName());
				bankInfo.setBranch(bdto.getBranch());
				bankInfo.setIfscCode(bdto.getIfscCode());
				bankInfo.setState(bdto.getState());
				
				return employeeBankRepository.save(bankInfo).getEmployeePrimaryInfo().getEmployeeId();
			}
		}
		return null;
	}

	@Override
	public String saveEducationInfo(EducationDtoList edto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(edto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			List<EmployeeEducationDetails> education = EmployeeUtil.dtoToEducationEntity(edto.getEducation());
			if(employee.getEmployeeEducationDetails()!= null) {
				employee.getEmployeeEducationDetails().stream().forEach(employeeEducationRepository::delete);
			}
			education.stream().forEach(x->x.setEmployeePrimaryInfo(employee));
			employee.setEmployeeEducationDetails(education);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeeExistanceException("Employee Id not registered");
	}

	@Override
	public String saveAddressInfo(AddressDtoList adto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(adto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			List<EmployeeAddressDetails> address = EmployeeUtil.dtoToAddressEntity(adto.getAddress());
			if(employee.getEmployeeAddressDetails()!= null) {
				employee.getEmployeeAddressDetails().stream().forEach(employeeAddressRepository::delete);
			}
			address.stream().forEach(x->x.setEmployeePrimaryInfo(employee));
			employee.setEmployeeAddressDetails(address);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeeExistanceException("Employee Id not found");
	}

	@Override
	public String saveContactInfo(ContactDtoList cdto) {
	Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(cdto.getEmployeeId());
	if(optional.isPresent()) {
		EmployeePrimaryInfo employee = optional.get();
		List<EmployeeContactDetails> contact = EmployeeUtil.dtoToContactEntity(cdto.getContact());
		if(employee.getEmployeeContactDetails()!=null) {
			employee.getEmployeeContactDetails().stream().forEach(c -> employeeContactRepository.delete(c));
		}
		contact.stream().forEach(x->x.setEmployeePrimaryInfo(employee));
		employee.setEmployeeContactDetails(contact);
		employeeRepository.save(employee);
		return employee.getEmployeeId();
	}
		throw new EmployeeExistanceException("Employee Id not found");
	}

	@Override
	public String saveExperienceInfo(ExperienceDtoList exdto) {
	   Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(exdto.getEmployeeId());
	   if(optional.isPresent()) {
		   EmployeePrimaryInfo employee = optional.get();
		   List<EmployeeExperienceDetails> experience = EmployeeUtil.dtoToExperienceEntity(exdto.getExperience());
		   if(employee.getEmployeeExperienceDetails()!=null) {
			   employee.getEmployeeExperienceDetails().stream().forEach(ex -> employeeExperienceRepository.delete(ex));
		   }
		   experience.stream().forEach(x->x.setEmployeePrimaryInfo(employee));
		   employee.setEmployeeExperienceDetails(experience);
		   employeeRepository.save(employee);
		   return employee.getEmployeeId();
	   }
		throw new EmployeeExistanceException("Employee Id not Found!");
	}

	@Override
	public String saveTechnicalInfo(TechnicalDtoList dto) {
		
			Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
			if(employeeOptional.isPresent())
			{
				EmployeePrimaryInfo employee = employeeOptional.get();
				List<EmployeeTechnicalSkills> skills = dto.getTechnical().stream().map(skill->
				{
					Optional<EmployeeTechnicalSkills> optional = employeeTechnicalRepository
							.findBySkillTypeAndSkillRatingAndYearOfExperience(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfExperience());
					
					return optional.isPresent() ? optional.get() : EmployeeUtil.dtoToTechnicalEntity(skill);			
				}).collect(Collectors.toList());

				if(employee.getEmployeeTechnicalSkills() != null)
				{
					employee.getEmployeeTechnicalSkills().clear();
				}
				
				skills.stream().forEach(x -> {
					if(!x.getEmployeePrimaryInfos().contains(employee))
						x.getEmployeePrimaryInfos().add(employee);
				});
				
				employee.setEmployeeTechnicalSkills(skills);
				employeeRepository.save(employee);
				return employee.getEmployeeId();
			}
			throw new EmployeeExistanceException("error");
		
	}
	
}

