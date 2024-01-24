package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostStatusEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface PostStatusMapper extends GenericMapper<PostStatus, PostStatusEntity> {
    
    PostStatus toDto(PostStatusEntity entity);
}
