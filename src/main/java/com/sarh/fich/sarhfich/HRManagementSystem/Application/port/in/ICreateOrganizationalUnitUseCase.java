package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalUnitCommand;

public interface ICreateOrganizationalUnitUseCase {
    
    public boolean saveOrganizationalUnit(OrganizationalUnitCommand command);
}
