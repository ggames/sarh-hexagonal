package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import org.mapstruct.Mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalUnitEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface OrganizationalUnitMapper extends GenericMapper<OrganizationalUnit, OrganizationalUnitEntity>{
    
    OrganizationalUnit toDto(OrganizationalUnitEntity source);

    //OrganizationalUnitEntity toEntity(OrganizationalUnit target);
}
