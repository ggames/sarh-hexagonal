package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;



import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

@UseCase
public class UpdateAgentUseCase implements IUpdateAgentUseCase {

    private final ILoadAgentPort loadAgentPort;
    private final IUpdateAgentPort updateAgentPort;

    Logger logger = LoggerFactory.getLogger(UpdateAgentUseCase.class);
   
    public UpdateAgentUseCase(ILoadAgentPort loadAgentPort, 
                            IUpdateAgentPort updateAgentPort){
        this.loadAgentPort = loadAgentPort;
        this.updateAgentPort = updateAgentPort;
      
    }

    @Transactional
    @Override
    public boolean updateAgent(Long id, AgentCommand command)  {
        
        Agent agent = loadAgentPort.load(id);
        
      
             logger.info("AGENTE " + agent);
        
                   agent.setFirstname(command.getFirstname());
                   agent.setLastname(command.getFirstname());



                   agent.setDocumentType(command.getDocumentType());
                   agent.setDocument(command.getDocument());
                   agent.setBirthDate(command.getBirthDate());
                   agent.setEmail(command.getEmail());
                   agent.setDocket(command.getDocket());
                   agent.setPhone(command.getPhone());
                   agent.setAddress(command.getAddress());
                   
        
        //agent = agent.builder();
        updateAgentPort.update(agent);
        return true;
    }
    
}
