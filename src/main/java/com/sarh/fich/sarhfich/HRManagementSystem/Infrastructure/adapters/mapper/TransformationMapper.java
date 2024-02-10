package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;


import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TransformationEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface TransformationMapper extends GenericMapper<Transformation, TransformationEntity> {

    Transformation toDto(TransformationEntity entity); 
      
    
}
