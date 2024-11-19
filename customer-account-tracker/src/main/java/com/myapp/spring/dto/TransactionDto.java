package com.myapp.spring.dto;

import java.time.LocalDateTime;

import com.myapp.spring.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {

	Long id;

	double amount;

	TransactionType transactionType;

	LocalDateTime timestamp;

	String senderAccountNumber;

    String receiverAccountNumber;

}
