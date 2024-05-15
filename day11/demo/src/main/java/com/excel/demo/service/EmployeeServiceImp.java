package com.excel.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

//	List<Employee> employees = new ArrayList();

	@Autowired
	private EmployeeRepository employeeRepository;//-->For Repository
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
				.aadharNo(dto.getAadharNo()).mobileNo(dto.getMobileNo()).employeeNo(dto.getEmployeeNo())
				.panNo(dto.getPanNo()).build();

	
//		employee.setId((int) (Math.random() * 10));
//		employees.add(employee);

		Employee save = employeeRepository.save(employee);//-->for Repository
		
//		return EmployeeDto.builder().id(employee.getId()).aadharNo(employee.getAadharNo())
//				.employeeNo(employee.getEmployeeNo()).firstName(employee.getFirstName())
//				.lastName(employee.getLastName()).mobileNo(employee.getMobileNo()).panNo(employee.getPanNo()).build();
		
		return EmployeeDto.builder().id(save.getId()).aadharNo(save.getAadharNo())
				.employeeNo(save.getEmployeeNo()).firstName(save.getFirstName())
				.lastName(save.getLastName()).mobileNo(save.getMobileNo()).panNo(save.getPanNo()).build();

	}
//	@Override
//	public void deleteEmployee(Employee dto) {
//		Optional<Employee> optional = employeeRepository.findById(dto.getId());
//		if(optional.isPresent())
//			employeeRepository.delete(dto);
//		else
//			
//			
//			
//	}
	public void deleteDepartmentById(int employeeId) 
    { 
        employeeRepository.deleteById(employeeId); 
    } 
	@Override
	public List<EmployeeDto> getAllEmployees(){
		return employeeRepository.findAll().stream().map(e->EmployeeDto.builder().id(e.getId()).aadharNo(e.getAadharNo())
				.employeeNo(e.getEmployeeNo()).firstName(e.getFirstName())
				.lastName(e.getLastName()).mobileNo(e.getMobileNo()).panNo(e.getPanNo()).build()).toList();
	}
}
