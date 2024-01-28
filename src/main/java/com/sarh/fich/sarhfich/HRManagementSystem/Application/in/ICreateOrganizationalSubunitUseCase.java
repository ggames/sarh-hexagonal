package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalSubunitCommand;

public interface ICreateOrganizationalSubunitUseCase { 

    public boolean saveOrganizationalSubUnit(OrganizationalSubunitCommand command);
    
}
