package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TypeOfPostEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface TypeOfPostMapper extends GenericMapper<TypeOfPost, TypeOfPostEntity> {

    TypeOfPost toDto(TypeOfPostEntity entity);

    TypeOfPostEntity toEntity(TypeOfPost dto);
}
