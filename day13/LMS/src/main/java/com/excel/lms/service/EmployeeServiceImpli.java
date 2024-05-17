package com.excel.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.PrimaryDTO;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.exception.EmployeeExistanceException;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.util.EmployeeUtil;

@Service
public class EmployeeServiceImpli implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String savePrimaryInfo(PrimaryDTO pDto) {
		if(!employeeRepository.findByPrimaryId(pDto.getPrimaryId()).isPresent()) {
			EmployeePrimaryInfo employee = EmployeeUtil.dtoToEntity(pDto);
			employeeRepository.save(employee);
			return employee.getPrimaryId();
		}
		throw new EmployeeExistanceException("Check EmployeeId Entered!!");
	}
//	@Override
//	public String saveSecondaryInfo(SecondaryDTO sDto) {
//		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findById(sDto.getPr)
//	}
}

