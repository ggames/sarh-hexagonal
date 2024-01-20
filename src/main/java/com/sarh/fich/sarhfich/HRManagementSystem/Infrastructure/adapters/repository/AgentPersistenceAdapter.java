package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.AgentEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.AgentMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class AgentPersistenceAdapter implements ILoadAgentPort, IUpdateAgentPort, ISaveAgentPort {

    private SpringAgentRepository agentRepository;

    private AgentMapper agentMapper;

    Logger logger = LoggerFactory.getLogger(AgentPersistenceAdapter.class);

    public AgentPersistenceAdapter(AgentMapper mapper, SpringAgentRepository agentRepository) {
        this.agentMapper = mapper;
        this.agentRepository = agentRepository;
    }

    @Override
    public Agent load(Long id) {

        AgentEntity agentEntity = agentRepository.findById(id).orElseThrow(RuntimeException::new);

        return agentMapper.toDto(agentEntity);
    }

    @Override
    public void update(Agent agent) {

        AgentEntity agentEntity = agentMapper.toEntity(agent);
        agentRepository.save(agentEntity);
    }

    @Override
    public void save(Agent agent) {

        logger.info("AGENTE " + agent);
        AgentEntity agentEntity = agentMapper.toEntity(agent);

        agentRepository.save(agentEntity);
    } // TODO Auto-generated method stub

}
