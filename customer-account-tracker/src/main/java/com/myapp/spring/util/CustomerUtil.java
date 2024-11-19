package com.myapp.spring.util;

import com.myapp.spring.dto.CustomerDto;
import com.myapp.spring.entity.Customer;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerUtil {

	public static Customer updateCustomer(Customer customer, CustomerDto customerDto ) {
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		return customer;
	}

}
