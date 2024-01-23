package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalSubunitCommand;

public interface IUpdateOrganizationalSubunitUseCase {
    
    public boolean updateOrganizationalSubUnit(Long id, OrganizationalSubunitCommand command);
}
