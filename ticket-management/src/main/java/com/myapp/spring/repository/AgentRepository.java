package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
