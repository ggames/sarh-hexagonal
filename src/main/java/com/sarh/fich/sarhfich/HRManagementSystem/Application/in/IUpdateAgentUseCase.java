package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;

public interface IUpdateAgentUseCase {

    public boolean updateAgent(Long id, AgentCommand command);
}
