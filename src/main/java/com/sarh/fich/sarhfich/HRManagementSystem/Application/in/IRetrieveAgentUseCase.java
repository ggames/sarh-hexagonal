package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import java.util.List;
import java.util.Optional;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

public interface IRetrieveAgentUseCase {
    
    List<Agent> getAllAgents();
    Agent findByDocument(String document);

}
