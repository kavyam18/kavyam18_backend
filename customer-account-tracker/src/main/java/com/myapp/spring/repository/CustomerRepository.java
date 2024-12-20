package com.myapp.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByEmail(String email);

	Optional<Customer> findById(Long id);

}
