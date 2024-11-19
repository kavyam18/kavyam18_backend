package com.myapp.spring.controller;

import java.util.List;

import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_ACCOUNT_CREATED_SUCCESSFULLY;
import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_ACCOUNT_DETAILS_FETCHED_SUCCESSFULLY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dto.CustomerAccountDto;
import com.myapp.spring.dto.CustomerDto;
import com.myapp.spring.response.CommonResponse;
import com.myapp.spring.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cat")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
	public ResponseEntity<CommonResponse<CustomerDto>> addCustomer(@RequestBody CustomerDto customerDto){
		CustomerDto customer = customerService.addCustomer(customerDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.<CustomerDto>builder()
				.data(customer).isError(false).message(CUSTOMER_ACCOUNT_CREATED_SUCCESSFULLY).build());
	}
	
	@GetMapping("/customerAccount")
	public ResponseEntity<CommonResponse<List<CustomerAccountDto>>> getAllCustomerAccount(){
		List<CustomerAccountDto> customerAccount = customerService.getAllCustomerAccount();
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<List<CustomerAccountDto>>builder().data(customerAccount).isError(false)
				.message(CUSTOMER_ACCOUNT_DETAILS_FETCHED_SUCCESSFULLY).build());
	}
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<CommonResponse<CustomerDto>> updateCustomer(@RequestBody CustomerDto dto){
		CustomerDto update = customerService.updateCustomerAccount(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponse.<CustomerDto>builder().data(update).isError(false)
				.message("Customer Details Updated Successfully!").build());
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<CommonResponse<CustomerDto>> getCustomerById(@PathVariable("id") Long id){
		CustomerDto customer = customerService.getCustomerById(id);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<CustomerDto>builder().data(customer)
				.isError(false).message(CUSTOMER_ACCOUNT_DETAILS_FETCHED_SUCCESSFULLY).build());
	}
	
}
