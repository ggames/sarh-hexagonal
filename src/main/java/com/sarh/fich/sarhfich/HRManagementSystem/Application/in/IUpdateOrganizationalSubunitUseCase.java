package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalSubunitCommand;

public interface IUpdateOrganizationalSubunitUseCase {
    
    public boolean updateOrganizationalSubUnit(Long id, OrganizationalSubunitCommand command);
}
