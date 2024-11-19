package com.myapp.spring.mapper;

import org.mapstruct.Mapper;

import com.myapp.spring.dto.CustomerDto;
import com.myapp.spring.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends GenericMapper<CustomerDto, Customer> {

}
