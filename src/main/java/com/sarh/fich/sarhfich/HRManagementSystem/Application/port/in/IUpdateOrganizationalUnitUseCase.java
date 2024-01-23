package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalUnitCommand;

public interface IUpdateOrganizationalUnitUseCase {
    
    public boolean updateOrganizationalUnit(Long id, OrganizationalUnitCommand command);
}
