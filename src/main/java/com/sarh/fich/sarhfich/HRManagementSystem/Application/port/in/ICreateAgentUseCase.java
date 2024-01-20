package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.AgentCommand;

public interface ICreateAgentUseCase {
    
    public boolean createAgent(AgentCommand command);
}
