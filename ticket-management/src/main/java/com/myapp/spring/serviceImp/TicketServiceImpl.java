package com.myapp.spring.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.entity.Agent;
import com.myapp.spring.entity.Ticket;
import com.myapp.spring.enums.Status;
import com.myapp.spring.mapper.TicketMapper;
import com.myapp.spring.repository.AgentRepository;
import com.myapp.spring.repository.TicketRepository;
import com.myapp.spring.service.TicketService;
import com.myapp.spring.util.TicketUtil;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	private AgentRepository agentRepository;
	
	@Override
	public TicketDto createTicket(TicketDto ticketDto) {
		
		Ticket ticket = TicketMapper.INSTANCE.dtoToEntity(ticketDto);
		TicketUtil.populateTicket(ticket, ticketDto);
		
		Ticket savedTicket = ticketRepository.save(ticket);
		TicketDto entityToDto = TicketMapper.INSTANCE.entityToDto(savedTicket);
	 return entityToDto;
	}


	@Override
	public TicketDto assignAgentToTicket(Long ticketId, Long agentId) {
		Ticket existingTicket = ticketRepository.findById(ticketId).get();
		Agent existingAgent = agentRepository.findById(agentId).get();
		existingTicket.setStatus(Status.IN_PROGRESS);
		existingTicket.setAgent(existingAgent);
		ticketRepository.save(existingTicket);
		TicketDto entityToDto = TicketMapper.INSTANCE.entityToDto(existingTicket);
		return entityToDto;
	}
	
	
	

}
