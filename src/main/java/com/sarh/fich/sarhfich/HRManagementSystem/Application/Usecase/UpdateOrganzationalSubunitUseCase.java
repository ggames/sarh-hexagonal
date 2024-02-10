package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalSubunitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateOrganzationalSubunitUseCase implements IUpdateOrganizationalSubunitUseCase {

    private final ILoadOrganizationalSubunitPort loadOrganizationalSubunit;

    private final IUpdateOrganizationalSubunitPort updateOrganizationalSubunit;

    public UpdateOrganzationalSubunitUseCase(ILoadOrganizationalSubunitPort loadOrganizationalSubunit,
      IUpdateOrganizationalSubunitPort updateOrganizationalSubunit){
         
          this.loadOrganizationalSubunit = loadOrganizationalSubunit;
          this.updateOrganizationalSubunit = updateOrganizationalSubunit;
      }
    @Override
    public boolean updateOrganizationalSubUnit(Long id, OrganizationalSubunitCommand command) {
         
        OrganizationalSubunit oSubunit = loadOrganizationalSubunit.load(id);

        oSubunit.setGuaraniCode(command.getGuaraniCode());
        oSubunit.setNameSubunit(command.getNameSubunit());
        oSubunit.setOrganizationalUnit(command.getOrganizationalUnit());
       
        updateOrganizationalSubunit.update(oSubunit);

        return true;
    }
    
}
