package com.myapp.spring.util;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.entity.Ticket;
import com.myapp.spring.enums.Status;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TicketUtil {

	   public static void populateTicket(Ticket ticket, TicketDto ticketDto) {
	        ticket.setDescription(ticketDto.getDescription());
	        ticket.setCreatedDate(ticketDto.getCreatedDate());
	        ticket.setStatus(Status.NEW); // Default status
	    }
}
