package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import java.util.List;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;

public interface IRetrieveAgentUseCase {
    
    List<Agent> getAllAgents();
    Agent findByDocument(String document);

}
