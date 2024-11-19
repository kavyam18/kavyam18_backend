package com.myapp.spring.util;

import java.time.LocalDateTime;

import com.myapp.spring.entity.Account;
import com.myapp.spring.entity.Transaction;
import com.myapp.spring.enums.TransactionType;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TransactionUtil {

	public static Transaction createTransaction(Account fromAccount, Account toAccount, Double amount, TransactionType type) {
	    Transaction transaction = new Transaction();
	    transaction.setAmount(amount);
	    transaction.setTransactionType(type);
	    transaction.setTimestamp(LocalDateTime.now());
	    transaction.setSenderAccount(fromAccount);
	    transaction.setReceiverAccount(toAccount);
	    return transaction; // Return the created transaction without saving
	}


}
