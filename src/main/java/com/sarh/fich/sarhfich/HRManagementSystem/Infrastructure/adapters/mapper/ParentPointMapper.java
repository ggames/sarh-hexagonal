package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.ParentPointEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface ParentPointMapper extends GenericMapper<ParentPoint, ParentPointEntity> {
    
    ParentPoint toDto(ParentPointEntity entity);
}