package com.myapp.spring.util;

import com.myapp.spring.dto.CustomerDto;
import com.myapp.spring.entity.Account;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountUtil {

    public static Account setAccountFromCustomerDto(CustomerDto customerDto) {
        Account account = new Account();
        
        // Assuming these fields are directly available in CustomerDto
        account.setAccountNumber(customerDto.getAccount().getAccountNumber());
        account.setAccountType(customerDto.getAccount().getAccountType());
        account.setBalance(customerDto.getAccount().getBalance());
       account.setBankName(customerDto.getAccount().getBankName());
        return account;
    }

	public static Account updateAccount(Account account, CustomerDto dto) {
	    account.setAccountType(dto.getAccount().getAccountType());
	    account.setBalance(dto.getAccount().getBalance());
	    return account;
	}
}
