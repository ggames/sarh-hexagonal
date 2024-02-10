package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PointEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = {TypeOfPostMapper.class})
public interface PointMapper extends GenericMapper<Point, PointEntity> {
    
    Point toDto(PointEntity entity);

    PointEntity toEntity(Point dto);
}
