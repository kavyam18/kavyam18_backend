package com.myapp.spring.mapper;

import java.util.List;

import org.mapstruct.Mapping;

import com.myapp.spring.model.Agent;

public interface GenericMapper<D, E> {

//	    @Mapping(target = "createdOn", source = "createdOn", ignore = true)
//	    @Mapping(target = "lastModifiedOn", source = "lastModifiedOn", ignore = true)
//	@Mapping(target = "resoutionSummary",defaultValue = "None", ignore = true)
	    E dtoToEntity(D dto);

	    D entityToDto(E entity);
	    
	    String map(Agent value);
	    Agent map(String value);

//	    @Mapping(target = "createdOn", source = "createdOn", ignore = true)
//	    @Mapping(target = "lastModifiedOn", source = "lastModifiedOn", ignore = true)
//		@Mapping(target = "resoutionSummary", ignore = true)
	    List<E> dtoToEntity(Iterable<D> dtos);

	    List<D> entityToDto (Iterable<E> entities);

}
