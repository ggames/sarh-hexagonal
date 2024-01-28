package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostPlantEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = {DocumentTypeMapper.class, AgentMapper.class, PositionMapper.class, OrganizationalSubunitMapper.class})
public interface PostPlantMapper extends GenericMapper<PostPlant, PostPlantEntity>{
    
    PostPlant toDto(PostPlantEntity entity);

    PostPlantEntity toEntity(PostPlant dto);
}
