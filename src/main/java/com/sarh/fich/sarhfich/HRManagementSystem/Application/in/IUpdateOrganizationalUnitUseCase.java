package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalUnitCommand;

public interface IUpdateOrganizationalUnitUseCase {
    
    public boolean updateOrganizationalUnit(Long id, OrganizationalUnitCommand command);
}
