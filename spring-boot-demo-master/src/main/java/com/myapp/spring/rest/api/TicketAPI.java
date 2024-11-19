package com.myapp.spring.rest.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.dto.TicketFilterDto;
import com.myapp.spring.service.TicketService;

@RestController
@RequestMapping("api/v1/tickets")
public class TicketAPI {
	
	private TicketService ticketService;

	public TicketAPI(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<TicketDto> createTicket(@RequestBody TicketDto ticketDto){
	TicketDto createdTicket = ticketService.createTicket(ticketDto);
	return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
	}
	@PutMapping("/{id}/agent/{agentId}")
	public ResponseEntity<TicketDto> assignAgent(@PathVariable("id") Long id, @PathVariable("agentId") Long agentId){
	TicketDto updatedTicket = ticketService.assignAgentToTicket(id, agentId);
	return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/close")
	public ResponseEntity<TicketDto> closeTicket(@PathVariable("id") Long id){
	TicketDto updatedTicket = ticketService.closeTicket(id);
	return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<TicketDto> updateTicket(@PathVariable("id") Long id, @RequestBody TicketDto ticketDto){
	TicketDto updatedTicket = ticketService.updateTicket(id, ticketDto);
	return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
	}
	
//	@GetMapping("/id")
//	public ResponseEntity<TicketDto> getTicketById(@PathVariable("id") Long id){
//		TicketDto ticketDto = ticketService.getTicketById(id);
//		return new ResponseEntity<>(ticketDto, HttpStatus.OK);
//	}
	
	//http://localhost:8808/api/v1/tickets?id=1
//	@GetMapping("/id")
//	public ResponseEntity<TicketDto> getTicketById(@RequestParam("id") Long id){
//		TicketDto ticketDto = ticketService.getTicketById(id);
//		return new ResponseEntity<>(ticketDto, HttpStatus.OK);
//	}
	
	@GetMapping()
	public ResponseEntity<List<TicketDto>> getTickets(TicketFilterDto ticketFilterDto){
		List<TicketDto> ticketDto = ticketService.getTickets(ticketFilterDto);
		return new ResponseEntity<>(ticketDto, HttpStatus.OK);
	}
	
	
}
