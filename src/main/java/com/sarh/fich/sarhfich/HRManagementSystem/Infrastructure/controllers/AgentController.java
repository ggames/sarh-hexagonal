package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;


import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions.ApiUnprocessableEntity;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@WebAdapter
@RestController
@RequestMapping("/sarh/agent")
public class AgentController {

    private final IUpdateAgentUseCase sendUpdateAgentPort;
    private final ICreateAgentUseCase sendNewAgentPort;
    private final IRetrieveAgentUseCase allAgentPort;
  
    public AgentController(IUpdateAgentUseCase sendUpdateAgentPort,
            ICreateAgentUseCase sendNewAgentPort, IRetrieveAgentUseCase allAgentPort) {
        this.sendUpdateAgentPort = sendUpdateAgentPort;
        this.sendNewAgentPort = sendNewAgentPort;
        this.allAgentPort = allAgentPort;
       
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@PathVariable() Long id,
                                    @RequestBody @Valid AgentCommand command) throws BusinessException {
           sendUpdateAgentPort.updateAgent(id, command);

        return new ResponseEntity<Agent>(HttpStatus.OK);
    }
   
    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    void create(@RequestBody Agent agent) throws ApiUnprocessableEntity {



        AgentCommand command = new AgentCommand(

                agent.getFirstname(),
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

    @GetMapping(path= "all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Agent>> getAll(){
          return ResponseEntity.ok(allAgentPort.getAllAgents());
    }

    @GetMapping(path = "agent/{document}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Agent> getAgentByDocument(@PathVariable("document") String document){
        return ResponseEntity.ok(allAgentPort.findByDocument(document));
    }


}
