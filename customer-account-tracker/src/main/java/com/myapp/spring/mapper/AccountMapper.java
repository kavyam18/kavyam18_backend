package com.myapp.spring.mapper;

import org.mapstruct.Mapper;

import com.myapp.spring.dto.AccountDto;
import com.myapp.spring.entity.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper extends GenericMapper<AccountDto, Account> {

}
