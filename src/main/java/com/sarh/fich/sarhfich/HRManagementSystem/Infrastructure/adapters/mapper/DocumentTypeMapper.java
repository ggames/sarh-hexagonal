package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.DocumentTypeEntity;

import org.mapstruct.Mapper;



import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring")
public interface DocumentTypeMapper extends GenericMapper<DocumentType, DocumentTypeEntity> {
    
   
    DocumentTypeEntity toEntity(DocumentType source);
    DocumentType toDto(DocumentTypeEntity target);
}
