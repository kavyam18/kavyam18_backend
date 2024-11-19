package com.myapp.spring.mapper;

import org.mapstruct.Mapper;

import com.myapp.spring.dto.TransactionDto;
import com.myapp.spring.entity.Transaction;

@Mapper(componentModel = "spring")
public interface TransactionMapper extends GenericMapper<TransactionDto, Transaction> {
	
}
