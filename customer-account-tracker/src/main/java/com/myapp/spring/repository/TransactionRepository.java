package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
