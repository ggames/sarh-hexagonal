package com.sarh.fich.sarhfich.HRManagementSystem.common;

import java.util.List;

import org.springframework.data.domain.Page;

/**
 * Mapper genérico con las operaciones básicas de transformación entre entidades
 * y DTOs, incluyendo List y Page.
 *
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter. DocumentTypeMapper mapper = Mappers.getMapper(DocumentTypeMapper.class);

 *
 * @author Games Gerardo
 */
public interface GenericMapper<D, E> {
    

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    default Page<D> toDto(Page<E> entityPage){
        return entityPage.map(data -> toDto(data));
    }   
}
