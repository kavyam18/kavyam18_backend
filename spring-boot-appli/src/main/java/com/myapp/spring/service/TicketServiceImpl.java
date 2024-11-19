package com.myapp.spring.service;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.model.Agent;
import com.myapp.spring.model.Status;
import com.myapp.spring.model.Ticket;
import com.myapp.spring.repository.AgentRepository;
import com.myapp.spring.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	private TicketRepository ticketRepository;
	
	private AgentRepository agentRepository;

	public TicketServiceImpl(TicketRepository ticketRepository, AgentRepository agentRepository) {
		this.ticketRepository = ticketRepository;
		this.agentRepository = agentRepository;
	}
	
	private  TicketDto convertToDto(Ticket ticket) {
		return new TicketDto(ticket.getId(), ticket.getDescription(),ticket.getStatus(),ticket.getCreatedDate(),
				ticket.getClosedDate(),ticket.getAssignedAgent().getName(), null);
	}

	@Override
	public TicketDto createTicket(TicketDto ticketDto) {
		
		Ticket ticket = new Ticket();
		ticket.setDescription(ticketDto.description());
		ticket.setCreatedDate(ticketDto.creaatedDate());
		ticket.setStatus(Status.NEW);
		Ticket savedTicket = ticketRepository.save(ticket);
		return convertToDto(savedTicket);
	}

	@Override
	public TicketDto assignAgentToTicket(Long ticketId, Long agentId) {
		Ticket existingTicket = ticketRepository.findById(ticketId).get();
		Agent existingAgent = agentRepository.findById(agentId).get();
		existingTicket.setStatus(Status.IN_PROGRESS);
		existingTicket.setAssignedAgent(existingAgent);
        ticketRepository.save(existingTicket);
		return null;
	}

	@Override
	public TicketDto resolveTicket(Long ticketId) {
		return null;
	}

	@Override
	public TicketDto closeTicket(Long ticketId) {
		return null;
	}

	@Override
	public TicketDto updateTicket(Long ticketId) {
		return null;
	}

	@Override
	public TicketDto getTicketById(Long ticketId) {
		return null;
	}

	@Override
	public List<TicketDto> getTickets(Long ticketId) {
		return null;
	}
	
	

//	@Override
//	public Ticket findById(Long id) {
//	
//		return repository.findById(id).get();
//	}
//
//	@Override
//	public List<Ticket> findAll() {
//		return repository.findAll();
//	}
//
//	@Override
//	public Ticket createNewTicket(Ticket ticket) {
//		return repository.save(ticket);
//	}

}



