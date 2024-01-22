package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import static com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent.*;

@UseCase
public class CreateAgentUseCase implements ICreateAgentUseCase {

    private final ISaveAgentPort saveAgentPort;

    Logger logger = LoggerFactory.getLogger(CreateAgentUseCase.class);
    
    public CreateAgentUseCase(ISaveAgentPort saveAgentPort){
        this.saveAgentPort = saveAgentPort;
    }

    @Override
    public boolean createAgent(AgentCommand command) {

        Agent agent = builder()
                      .name(command.getName())
                      .lastname(command.getLastname())
                      .documentType(command.getDocumentType())
                      .document(command.getDocument())
                      .birthDate(command.getBirthDate())
                      .docket(command.getDocket())
                      .email(command.getEmail())
                      .phone(command.getPhone())
                      .address(command.getAddress())
                      .build();

        logger.error("Objeto " + agent.getName() + "  " + agent.getLastname() + "  " + agent.getDocumentType() );              
        saveAgentPort.save(agent);

        return true;              
    }
    
}
