package com.myapp.spring.entity;

import java.util.List;

import com.myapp.spring.enums.AccountType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private Long id;

	@Column(name = "account_number", unique = true)
	private String accountNumber;
	
	private String bankName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	@Column(name = "account_balance")
	private double balance;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
	private Customer customer;
	
	@OneToMany(mappedBy = "senderAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Transaction> sentTransactions;
	
	@OneToMany(mappedBy = "receiverAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Transaction> receivedTransactions;
	
}
