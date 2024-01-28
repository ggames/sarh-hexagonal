package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.DocumentTypeEntity;

import org.mapstruct.Mapper;



import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;

@Mapper(componentModel = "spring", uses = { AgentMapper.class})
public interface DocumentTypeMapper extends GenericMapper<DocumentType, DocumentTypeEntity> {
    DocumentType toDto(DocumentTypeEntity target);
    DocumentTypeEntity toEntity(DocumentType source);
}
