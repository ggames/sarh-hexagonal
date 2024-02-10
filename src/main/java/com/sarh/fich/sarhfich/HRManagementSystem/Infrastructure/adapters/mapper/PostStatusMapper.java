package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostStatusEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = { CharacterPositionMapper.class, TransformationMapper.class, OrganizationalUnitMapper.class, PointMapper.class})
public interface PostStatusMapper extends GenericMapper<PostStatus, PostStatusEntity> {
    
    PostStatus toDto(PostStatusEntity entity);

    PostStatusEntity toEntity(PostStatus dto);
}
