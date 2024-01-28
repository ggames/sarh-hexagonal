package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalUnitCommand;

public interface ICreateOrganizationalUnitUseCase {
    
    public boolean saveOrganizationalUnit(OrganizationalUnitCommand command);
}
