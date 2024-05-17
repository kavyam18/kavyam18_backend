package com.excel.lms.dto;

import com.excel.lms.enums.ContactType;

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
public class ContactDTO {

private String contactId;

	private ContactType contactType;

	private Integer contactNumber;
}
