package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;

public interface ICreateAgentUseCase {
    
    public boolean createAgent(AgentCommand command);
}
