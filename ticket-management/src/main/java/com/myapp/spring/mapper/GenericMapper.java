package com.myapp.spring.mapper;

import java.util.List;

public interface GenericMapper<D, E> {

	E dtoToEntity(D dto);
	
	D entityToDto(E entity);
	
    List<E> dtoToEntity(Iterable<D> dtos);

    List<D> entityToDto (Iterable<E> entities);
}
