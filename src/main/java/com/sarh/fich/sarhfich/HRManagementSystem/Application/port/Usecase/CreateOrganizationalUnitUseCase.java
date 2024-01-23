package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;



import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateOrganizationalUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.OrganizationalUnitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;

public class CreateOrganizationalUnitUseCase implements ICreateOrganizationalUnitUseCase {

    private final ISaveOrganizationalUnitPort saveOrganizationalUnit;


    public CreateOrganizationalUnitUseCase(ISaveOrganizationalUnitPort saveOrganizationUnit){
        
        this.saveOrganizationalUnit = saveOrganizationUnit;
    }

    @Override
    public boolean saveOrganizationalUnit(OrganizationalUnitCommand command) {
        
        OrganizationalUnit organizationalUnit = OrganizationalUnit.builder()
                                              .nameUnit(command.getNameUnit())
                                              .director(command.getDirector())
                                              .vicePrincipal(command.getVicePrincipal()).build();
         
        saveOrganizationalUnit.save(organizationalUnit);                                      

        return true;
    }
    
}
