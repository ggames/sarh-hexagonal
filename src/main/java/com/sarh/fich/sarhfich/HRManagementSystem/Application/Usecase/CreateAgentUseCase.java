package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.business.DocumentTypeValidator;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;

import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;


@UseCase
public class CreateAgentUseCase implements ICreateAgentUseCase {

    private final ISaveAgentPort saveAgentPort;

    private final DocumentTypeValidator documentTypeValidator;

    Logger logger = LoggerFactory.getLogger(CreateAgentUseCase.class);

    public CreateAgentUseCase(ISaveAgentPort saveAgentPort,
                              DocumentTypeValidator documentTypeValidator) {
        this.saveAgentPort = saveAgentPort;
        this.documentTypeValidator = documentTypeValidator;
    }

    @Transactional
    @Override
    public boolean createAgent(AgentCommand command) throws BusinessException {

        documentTypeValidator.validator(command.getDocumentType());

        Agent agent = new Agent();

        agent.setFirstname(command.getFirstname());
        agent.setLastname(command.getLastname());

        /*if(retrieveDocumentType.fetchById(command.getDocumentType().getId()) == null){
            throw new BusinessException("P-401", HttpStatus.NOT_FOUND, "El tipo de documento no existe");
        }*/


            agent.setDocumentType(command.getDocumentType());


        agent.setDocument(command.getDocument());
        agent.setBirthDate(command.getBirthDate());
        agent.setDocket(command.getDocket());
        agent.setEmail(command.getEmail());
        agent.setPhone(command.getPhone());
        agent.setAddress(command.getAddress());


        logger.error("Objeto " + agent.getFirstname() + "  " + agent.getLastname() + "  " + agent.getDocumentType());
        saveAgentPort.save(agent);

        return true;
    }

}
