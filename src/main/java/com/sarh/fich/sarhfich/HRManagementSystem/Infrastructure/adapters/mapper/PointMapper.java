package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PointEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = {TypeOfPostMapper.class, ParentPointMapper.class})
public interface PointMapper extends GenericMapper<Point, PointEntity> {
    
    Point toDto(PointEntity entity);
}
