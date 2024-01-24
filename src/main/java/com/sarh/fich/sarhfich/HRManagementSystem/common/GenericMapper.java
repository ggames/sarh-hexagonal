package com.sarh.fich.sarhfich.HRManagementSystem.common;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
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
    
    @Mapping(ignore = true, target = "createdAt")
    @Mapping(ignore = true, target = "updatedAt")
    D toDto(E entity);

    @InheritInverseConfiguration
    @Mapping(ignore = true, target = "createdAt")
    @Mapping(ignore = true, target = "updatedAt")
    E toEntity(D dto);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);

    default Page<D> toDto(Page<E> entityPage){
        return entityPage.map(data -> toDto(data));
    }   
}
