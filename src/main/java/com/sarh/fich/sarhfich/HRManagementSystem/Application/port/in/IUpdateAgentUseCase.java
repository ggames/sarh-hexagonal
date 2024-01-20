package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.AgentCommand;

public interface IUpdateAgentUseCase {

    public boolean updateAgent(Long id,AgentCommand command);
}
