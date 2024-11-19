package com.myapp.spring.service;

import java.util.List;

import com.myapp.spring.dto.CustomerAccountDto;
import com.myapp.spring.dto.CustomerDto;

public interface CustomerService {

	CustomerDto addCustomer(CustomerDto customerDto);

	List<CustomerAccountDto> getAllCustomerAccount();

	CustomerDto updateCustomerAccount(CustomerDto dto);

	CustomerDto getCustomerById(Long id);

	

}
