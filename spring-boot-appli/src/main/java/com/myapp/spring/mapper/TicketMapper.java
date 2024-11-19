package com.myapp.spring.mapper;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.model.Ticket;


public interface TicketMapper {
	
	TicketDto toDto(Ticket ticket);
	
	Ticket fromDto(TicketDto ticketDto);

}
