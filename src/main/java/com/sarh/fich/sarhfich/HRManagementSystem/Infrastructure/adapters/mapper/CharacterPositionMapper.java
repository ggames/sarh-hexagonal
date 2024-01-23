package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;



import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.CharacterPositionEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface CharacterPositionMapper extends GenericMapper<CharacterPosition, CharacterPositionEntity> {
    
    CharacterPosition toDto(CharacterPositionEntity entity);
    
        
    
}
