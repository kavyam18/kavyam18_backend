package com.myapp.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.model.Agent;
import com.myapp.spring.repository.AgentRepository;
import com.myapp.spring.service.TicketService;

//(ComponentScan, EnableAutoConfiguration,SpringBootConfiguration)
@SpringBootApplication(exclude = ServletWebServerFactoryAutoConfiguration.class)
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

@Bean
CommandLineRunner ticketService(TicketService ticketService) {
		return args->{
			TicketDto existingTicketDto1 = ticketService.assignAgentToTicket(1L, 1L);
			TicketDto existingTicketDto2 = ticketService.assignAgentToTicket(2L, 1L);
			System.out.println(existingTicketDto1+ ""+existingTicketDto2);
			
//			Ticket newTicket = ticketService.createNewTicket(new Ticket("keyboard not working", LocalDateTime.now(), null, Status.NEW, null));
//		System.out.println("Ticket Saved " + newTicket);
	};
} 
	
	
	//@Bean
	CommandLineRunner agentRepository(AgentRepository agentRepository) {
		return args->{
			agentRepository.save(new Agent("Agent 1"));
			agentRepository.save(new Agent("Agent 2"));
			agentRepository.save(new Agent("Agent 3"));
			agentRepository.save(new Agent("Agent 4"));
		
		};
	}
}
