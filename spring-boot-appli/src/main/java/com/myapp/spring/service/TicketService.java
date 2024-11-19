package com.myapp.spring.service;

import java.util.List;

import com.myapp.spring.dto.TicketDto;



public interface TicketService {

//	Ticket findById(Long id);
//	
//	List<Ticket> findAll();
//	
//	@Transactional(propagation =  Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE,
//			timeout = 5)
//	Ticket createNewTicket(Ticket ticket);
//	
	
	
	
	TicketDto createTicket(TicketDto ticketDto);
	
	TicketDto assignAgentToTicket(Long ticketId, Long agentId);
	
	TicketDto resolveTicket(Long ticketId);
	
	TicketDto closeTicket(Long ticketId);
	
	TicketDto updateTicket(Long ticketId);
	
	TicketDto getTicketById(Long ticketId);
	
	List<TicketDto> getTickets(Long ticketId);



}
