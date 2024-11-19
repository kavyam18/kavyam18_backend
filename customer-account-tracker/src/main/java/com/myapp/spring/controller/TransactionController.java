package com.myapp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dto.TransactionDto;
import com.myapp.spring.dto.TransferRequestDto;
import com.myapp.spring.response.CommonResponse;
import com.myapp.spring.service.TransactionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/cat")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	
	@PostMapping("/transferFunds")
	public ResponseEntity<CommonResponse<String>> transferFunds(@RequestBody TransferRequestDto requestDto){
		String transfer = transactionService.transferFunds(requestDto.getSenderAccountNumber(),requestDto.getReceiverAccountNumber(), requestDto.getAmount());
		return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.<String>builder().data(transfer).isError(false).message(" Funds Transfer Successfully!").build());
	}
	
	@GetMapping("/getAllTransactions")
	public ResponseEntity<CommonResponse<List<TransactionDto>>> getAllTransactions(){
		List<TransactionDto> transaction = transactionService.getAllTransactions();
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<List<TransactionDto>>builder().data(transaction).isError(false).message("Transactions Fetch Successfully!").build());
	}
}
