package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalSubunitEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = { OrganizationalUnitMapper.class})
public interface OrganizationalSubunitMapper extends 
         GenericMapper<OrganizationalSubunit, OrganizationalSubunitEntity> {
    
        OrganizationalSubunit toDto(OrganizationalSubunitEntity entity); 
        
       // OrganizationalSubunitEntity toEntity(OrganizationalSubunit dto);
}
