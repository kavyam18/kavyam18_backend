package com.myapp.spring.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dto.TransactionDto;
import com.myapp.spring.entity.Account;
import com.myapp.spring.entity.Transaction;
import com.myapp.spring.enums.TransactionType;
import com.myapp.spring.mapper.TransactionMapper;
import com.myapp.spring.repository.AccountRepository;
import com.myapp.spring.repository.TransactionRepository;
import com.myapp.spring.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private TransactionMapper transactionMapper;
	
	public String transferFunds(String senderAccountNumber, String receiverAccountNumber, double amount) {
	    Account sender = accountRepository.findByAccountNumber(senderAccountNumber)
	        .orElseThrow(() -> new IllegalArgumentException("Sender account not found"));
	    Account receiver = accountRepository.findByAccountNumber(receiverAccountNumber)
	        .orElseThrow(() -> new IllegalArgumentException("Receiver account not found"));

	    if (sender.getBalance() < amount) {
	        throw new IllegalArgumentException("Insufficient funds");
	    }

	    sender.setBalance(sender.getBalance() - amount);
	    accountRepository.save(sender);

	    receiver.setBalance(receiver.getBalance() + amount);
	    accountRepository.save(receiver);

	    Transaction transaction = new Transaction();
	    transaction.setSenderAccount(sender);
	    transaction.setReceiverAccount(receiver);
	    transaction.setAmount(amount);
	    transaction.setTimestamp(LocalDateTime.now());
	    transaction.setTransactionType(TransactionType.DEBIT);
	    transactionRepository.save(transaction);

	    return receiverAccountNumber;
	}

	@Override
	public List<TransactionDto> getAllTransactions() {
		try {
			List<Transaction> transactions = transactionRepository.findAll();
			return transactions.stream().map(transaction -> transactionMapper.entityToDto(transaction)).collect(Collectors.toList());
		}catch (Exception e) {
			e.printStackTrace();
			return List.of();
		}
	}


}
