package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;


import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateOrganizationalUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalUnitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;

public class UpdateOrganizationalUnitUseCase implements IUpdateOrganizationalUnitUseCase{

    private final IUpdateOrganizationalUnitPort updateOrganizationalUnitPort;

    private final ILoadOrganizationalUnitPort loadOrganizationalUnitPort;

    public UpdateOrganizationalUnitUseCase(IUpdateOrganizationalUnitPort updateOrganizationalUnitPort,
        ILoadOrganizationalUnitPort loadOrganizationalUnitPort ){
            this.updateOrganizationalUnitPort = updateOrganizationalUnitPort;
            this.loadOrganizationalUnitPort = loadOrganizationalUnitPort;
        }

    @Override
    public boolean updateOrganizationalUnit(Long id, OrganizationalUnitCommand command) {
        OrganizationalUnit organizationalUnit = loadOrganizationalUnitPort.load(id);

        organizationalUnit.setNameUnit(command.getNameUnit());
        organizationalUnit.setDirector(command.getDirector());
        organizationalUnit.setVicePrincipal(command.getVicePrincipal());

        updateOrganizationalUnitPort.update(organizationalUnit); 

        return true;
    }
    
}
