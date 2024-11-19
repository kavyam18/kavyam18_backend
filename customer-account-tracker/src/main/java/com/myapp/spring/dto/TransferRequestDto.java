package com.myapp.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TransferRequestDto {

	private String senderAccountNumber;
    private String receiverAccountNumber;
    private double amount;
}
