package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.AgentEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.AgentMapper;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class AgentPersistenceAdapter implements ILoadAgentPort, 
 IUpdateAgentPort, ISaveAgentPort, IRetrieveAgentPort {

    private final AgentRepository agentRepository;

    private final AgentMapper agentMapper;

    Logger logger = LoggerFactory.getLogger(AgentPersistenceAdapter.class);

    public AgentPersistenceAdapter(AgentMapper mapper, AgentRepository agentRepository) {
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

    @Override
    public List<Agent> getAllAgents() {
        List<AgentEntity> agents = agentRepository.findAll();

        return agentMapper.toDto(agents);
    }



    @Override
    public Agent findByDocument(String document) {

        AgentEntity agent = agentRepository.findByDocument(document).orElseThrow(RuntimeException::new);

        return agentMapper.toDto(agent);
    }

}
