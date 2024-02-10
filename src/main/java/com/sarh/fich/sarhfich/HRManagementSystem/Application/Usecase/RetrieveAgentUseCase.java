package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import java.util.List;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveAgentUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveAgentPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@UseCase
public class RetrieveAgentUseCase implements IRetrieveAgentUseCase {

    private final IRetrieveAgentPort retrieveAgent;

    public RetrieveAgentUseCase(IRetrieveAgentPort retrieveAgent){

        this.retrieveAgent = retrieveAgent;
    }

    @Override
    public List<Agent> getAllAgents() {
       
       return retrieveAgent.getAllAgents();
    }

    @Override
    public Agent findByDocument(String document) {

        return retrieveAgent.findByDocument(document);
    }

}
