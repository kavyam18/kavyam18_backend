package com.myapp.spring.serviceImpl;

import static com.myapp.spring.constant.AccountConstant.ACCOUNT_ALREADY_EXISTS;
import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_EMAIL_ALREADY_PRESENT;
import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_ACCOUNT_DETAILS_FAILED_TO_FETCH;
import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_EMAIL_ID_NOT_FOUND;
import static com.myapp.spring.constant.AccountConstant.CUSTOMER_ACCOUNT_NOT_FOUND;
import static com.myapp.spring.constant.CustomerConstant.CUSTOMER_ID_NOT_FOUND;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dto.CustomerAccountDto;
import com.myapp.spring.dto.CustomerDto;
import com.myapp.spring.entity.Account;
import com.myapp.spring.entity.Customer;
import com.myapp.spring.exception.AccountExistenceException;
import com.myapp.spring.exception.CustomerExistenceException;
import com.myapp.spring.exception.CustomerNotFoundException;
import com.myapp.spring.exception.DataRetrievalException;
import com.myapp.spring.exception.NotFoundException;
import com.myapp.spring.mapper.CustomerMapper;
import com.myapp.spring.repository.AccountRepository;
import com.myapp.spring.repository.CustomerRepository;
import com.myapp.spring.service.CustomerService;
import com.myapp.spring.util.AccountUtil;
import com.myapp.spring.util.CustomerUtil;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
	    Optional<Customer> optional = customerRepository.findByEmail(customerDto.getEmail());
	    
	    if (!optional.isPresent()) {
	        Customer customer = customerMapper.dtoToEntity(customerDto);
	        if (customerDto.getAccount() != null) {
	            Optional<Account> existingAccount = accountRepository.findByAccountNumber(customerDto.getAccount().getAccountNumber());
	            if (!existingAccount.isPresent()) {
	                Account account = AccountUtil.setAccountFromCustomerDto(customerDto);
	                customer.setAccount(account);
	            } else {
	                throw new AccountExistenceException(ACCOUNT_ALREADY_EXISTS);
	            }
	        } else {
	            throw new IllegalArgumentException("Account details are missing in CustomerDto.");
	        }
	        Customer savedCustomer = customerRepository.save(customer);
	        return customerMapper.entityToDto(savedCustomer);
	    }
	    throw new CustomerExistenceException(CUSTOMER_EMAIL_ALREADY_PRESENT);
	}

	@Override
	public List<CustomerAccountDto> getAllCustomerAccount() {
		try {
			List<Customer> customers = customerRepository.findAll();
			return customers.stream().map(customer -> {
				Account account = customer.getAccount();
				return new CustomerAccountDto(customer.getId(), customer.getName(), customer.getEmail(),
						account != null ? account.getAccountNumber() : "No account created");
			}).collect(Collectors.toList());
		} catch (Exception e) {
			throw new DataRetrievalException(CUSTOMER_ACCOUNT_DETAILS_FAILED_TO_FETCH, e);
		}
	}

	@Override
	public CustomerDto updateCustomerAccount(CustomerDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		if (optional.isPresent()) {
			Customer customer = optional.get();
			customer = CustomerUtil.updateCustomer(customer, dto);
			Optional<Account> optionalAccount = accountRepository.findByAccountNumber(customer.getAccount().getAccountNumber());
			if (optionalAccount.isPresent()) {
				Account account = optionalAccount.get();
				account = AccountUtil.updateAccount(account, dto);
				customer.setAccount(account);
			} else {
				throw new NotFoundException(CUSTOMER_ACCOUNT_NOT_FOUND);
			}

			Customer savedCustomer = customerRepository.save(customer);
			return customerMapper.entityToDto(savedCustomer);
		}
		throw new CustomerNotFoundException(CUSTOMER_EMAIL_ID_NOT_FOUND);
	}

	@Override
	public CustomerDto getCustomerById(Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if(optional.isPresent()) {
			Customer customer = optional.get();
			return customerMapper.entityToDto(customer);
		}
		throw new NotFoundException(CUSTOMER_ID_NOT_FOUND);
	}

}
