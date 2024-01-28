package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PositionEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = { PointMapper.class, 
        PostStatusMapper.class,
        OrganizationalUnitMapper.class,
        CharacterPositionMapper.class,
        TransformationMapper.class })
public interface PositionMapper extends GenericMapper<Position, PositionEntity> {

    Position toDto(PositionEntity entity);

    PositionEntity toEntity(Position dto);

}
