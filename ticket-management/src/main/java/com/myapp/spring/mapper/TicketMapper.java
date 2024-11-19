package com.myapp.spring.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.entity.Ticket;

@Mapper(componentModel = "spring")
public interface TicketMapper extends GenericMapper<TicketDto, Ticket> {

	TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
	
	//we can use this directly when we don't extends GenericMapper
//	Ticket dtoToEntity(TicketDto ticketDto);
//    TicketDto entityToDto(Ticket ticket);
}
