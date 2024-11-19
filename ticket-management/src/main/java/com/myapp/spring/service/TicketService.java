package com.myapp.spring.service;

import com.myapp.spring.dto.TicketDto;

public interface TicketService  {

	TicketDto createTicket(TicketDto ticketDto);

	TicketDto assignAgentToTicket(Long ticketId, Long agentId);

}
