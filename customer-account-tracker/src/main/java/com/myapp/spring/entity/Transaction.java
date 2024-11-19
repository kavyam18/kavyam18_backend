package com.myapp.spring.entity;

import java.time.LocalDateTime;

import com.myapp.spring.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id")
	private Long id;

	@Column(name = "transaction_amount")
	private double amount;

	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;

	private LocalDateTime timestamp;

	@ManyToOne
	@JoinColumn(name = "sender_account_id") // Foreign key to the sender account
	private Account senderAccount;

	@ManyToOne
	@JoinColumn(name = "receiver_account_id") // Foreign key to the receiver account
	private Account receiverAccount;

}
