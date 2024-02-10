package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions.ApiNotFoundException;
import com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions.ApiUnprocessableEntity;

public interface ICreateAgentUseCase {
    
    public boolean createAgent(AgentCommand command) throws BusinessException;
}
