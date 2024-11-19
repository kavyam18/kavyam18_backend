package com.myapp.spring.dto;

import java.time.LocalDateTime;

import com.myapp.spring.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketDto {

	Long id;

	String description;

	LocalDateTime createdDate;

	LocalDateTime closedDate;

	Status status;
	
}
