package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;


@UseCase
public class CreateAgentUseCase implements ICreateAgentUseCase {

    private final ISaveAgentPort saveAgentPort;

    Logger logger = LoggerFactory.getLogger(CreateAgentUseCase.class);
    
    public CreateAgentUseCase(ISaveAgentPort saveAgentPort){
        this.saveAgentPort = saveAgentPort;
    }

    @Transactional
    @Override
    public boolean createAgent(AgentCommand command) {

        Agent agent = new Agent();

                agent.setFirstname(command.getFirstName());
                agent.setLastname(command.getLastName());
                agent.setDocumentType(command.getDocumentType());
                agent.setDocumentType(command.getDocumentType());
                agent.setBirthDate(command.getBirthDate());
                agent.setDocket(command.getDocket());
                agent.setEmail(command.getEmail());
                agent.setPhone(command.getPhone());
                agent.setAddress(command.getAddress());


        logger.error("Objeto " + agent.getFirstname() + "  " + agent.getLastname() + "  " + agent.getDocumentType() );
        saveAgentPort.save(agent);

        return true;              
    }
    
}
