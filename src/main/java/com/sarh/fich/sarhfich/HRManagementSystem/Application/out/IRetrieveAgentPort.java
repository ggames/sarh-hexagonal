package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import java.util.List;
import java.util.Optional;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;

public interface IRetrieveAgentPort {
    List<Agent> getAllAgents();
    Agent findByDocument(String document);

}
