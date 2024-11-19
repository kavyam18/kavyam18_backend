package com.myapp.spring.service;

import java.util.List;

import com.myapp.spring.dto.TransactionDto;

public interface TransactionService {

	String transferFunds(String senderAccountNumber, String receiverAccountNumber, double amount);

	List<TransactionDto> getAllTransactions();
}
