package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalSubunitCommand;

public interface ICreateOrganizationalSubunitUseCase { 

    public boolean saveOrganizationalSubUnit(OrganizationalSubunitCommand command);
    
}
