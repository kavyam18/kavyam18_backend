package com.myapp.spring.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.response.CommonResponse;
import com.myapp.spring.service.TicketService;

import lombok.RequiredArgsConstructor;

import static com.myapp.spring.constant.TicketConstant.TICKET_CREATED_SUCCESSFULLY;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/tickets")
@CrossOrigin
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@PostMapping(path = "/create")
	public ResponseEntity<CommonResponse<TicketDto>> createTickets(@RequestBody TicketDto ticketDto){
		TicketDto createdTicket = ticketService.createTicket(ticketDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(CommonResponse.<TicketDto>builder().data(createdTicket).
				isError(false).message(TICKET_CREATED_SUCCESSFULLY).build());	
	}
	@PutMapping("/{ticketId}/agent/agentId")
	public ResponseEntity<CommonResponse<TicketDto>> assignAgent(@PathVariable("ticketId") Long ticketId, @PathVariable("agentId") Long agentId){
		TicketDto assignTicket = ticketService.assignAgentToTicket(ticketId, agentId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponse.<TicketDto>builder()
				.data(assignTicket).isError(false).message("").build());
	}
}
