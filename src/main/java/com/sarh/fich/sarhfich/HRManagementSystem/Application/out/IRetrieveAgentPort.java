package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import java.util.List;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;

public interface IRetrieveAgentPort {
    List<Agent> getAllAgents();
    Agent findByDocument(String document);

}
