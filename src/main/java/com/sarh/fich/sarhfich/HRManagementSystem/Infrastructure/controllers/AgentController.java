package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;


import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions.ApiUnprocessableEntity;

import jakarta.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@WebAdapter
@RestController
@RequestMapping("/sarh")
public class AgentController {

    private final IUpdateAgentUseCase sendUpdateAgentPort;
    private final ICreateAgentUseCase sendNewAgentPort;
  
    public AgentController(IUpdateAgentUseCase sendUpdateAgentPort,
            ICreateAgentUseCase sendNewAgentPort) {
        this.sendUpdateAgentPort = sendUpdateAgentPort;
        this.sendNewAgentPort = sendNewAgentPort;
       
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void update(@PathVariable() Long id, @RequestBody @Valid Agent agent) throws ApiUnprocessableEntity {

      

        AgentCommand command = new AgentCommand(

                agent.getName(),
                agent.getLastname(),
                agent .getDocumentType(),
                agent.getDocument(),
                agent.getBirthDate(),
                agent.getDocket(),
                agent.getEmail(),
                agent.getPhone(),
                agent.getAddress());

        sendUpdateAgentPort.updateAgent(id, command);
    }
   
    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    void create(@RequestBody Agent agent) throws ApiUnprocessableEntity {
      

        AgentCommand command = new AgentCommand(

                agent.getName(),
                agent.getLastname(),
                agent.getDocumentType(),
                agent.getDocument(),
                agent.getBirthDate(),
                agent.getDocket(),
                agent.getEmail(),
                agent.getPhone(),
                agent.getAddress());

        sendNewAgentPort.createAgent(command);
    }

}
