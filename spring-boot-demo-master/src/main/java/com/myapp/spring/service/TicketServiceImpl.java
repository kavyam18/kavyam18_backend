package com.myapp.spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.dto.TicketFilterDto;
import com.myapp.spring.mapper.TicketMapper;
import com.myapp.spring.model.Agent;
import com.myapp.spring.model.Status;
import com.myapp.spring.model.Ticket;
import com.myapp.spring.repository.AgentRepository;
import com.myapp.spring.repository.TicketRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE, timeout = 5000)
public class TicketServiceImpl implements TicketService {

	private TicketRepository ticketRepository;

	private AgentRepository agentRepository;

	public TicketServiceImpl(TicketRepository ticketRepository, AgentRepository agentRepository) {
		this.ticketRepository = ticketRepository;
		this.agentRepository = agentRepository;
	}

	private TicketDto convertToDto(Ticket ticket) {
		return new TicketDto(ticket.getId(), ticket.getDescription(), ticket.getStatus(), ticket.getCreatedDate(),
				ticket.getClosedDate(), ticket.getAssignedAgent() != null ? ticket.getAssignedAgent().getName() : "",
				null);
	}

	@Override
	public TicketDto createTicket(TicketDto ticketDto) {

//		Ticket ticket = TicketMapper.INSTANCE.dtoToEntity(ticketDto);

		Ticket ticket = new Ticket();
		ticket.setDescription(ticketDto.description());
		ticket.setCreatedDate(ticketDto.createdDate());
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
		return convertToDto(existingTicket);
	}

	@Override
	public TicketDto resolveTicket(Long ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDto closeTicket(Long ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDto updateTicket(Long ticketId, TicketDto ticketDto) {
		return null;
	}

	@Override
	public TicketDto getTicketById(Long ticketId) {
		return null;
	}

	@Override
	public List<TicketDto> getTickets(TicketFilterDto ticketFilterDto) {
		List<Ticket> filteredTickets = ticketRepository.findWithFilters(ticketFilterDto.status(),
				ticketFilterDto.startDate(), ticketFilterDto.endDate(), ticketFilterDto.assignedAgent());
		TicketMapper.INSTANCE.entityToDto(filteredTickets);
		return filteredTickets.stream().map(this::convertToDto).collect(Collectors.toList());
	}

//	@Override
//	public Ticket findById(Long id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id).get();
//	}
//
//	@Override
//	public List<Ticket> findAll() {
//		// TODO Auto-generated method stub
//		return repository.findAll();
//	}
//
//	@Override
////	@Transactional(propagation = Propagation.REQUIRED ,isolation = Isolation.SERIALIZABLE,
////	timeout = 5)
//	public Ticket createNewTicket(Ticket ticket) {
//		// TODO Auto-generated method stub
//		return repository.save(ticket);
//	}

}
