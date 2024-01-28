package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper;



import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.AgentEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = DocumentTypeMapper.class)
    public interface AgentMapper extends GenericMapper<Agent, AgentEntity> {


        Agent toDto(AgentEntity entity); 
        
        
        
    }
    
