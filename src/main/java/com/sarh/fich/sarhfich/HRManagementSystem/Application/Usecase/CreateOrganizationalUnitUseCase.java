package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;



import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateOrganizationalUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalUnitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateOrganizationalUnitUseCase implements ICreateOrganizationalUnitUseCase {

    private final ISaveOrganizationalUnitPort saveOrganizationalUnit;


    public CreateOrganizationalUnitUseCase(ISaveOrganizationalUnitPort saveOrganizationUnit){
        
        this.saveOrganizationalUnit = saveOrganizationUnit;
    }

    @Override
    public boolean saveOrganizationalUnit(OrganizationalUnitCommand command) {
        
        OrganizationalUnit organizationalUnit = new OrganizationalUnit();
        organizationalUnit.setNameUnit(command.getNameUnit());
        organizationalUnit.setDirectorId(command.getDirector());
        organizationalUnit.setVicePrincipalId(command.getVicePrincipal());

        saveOrganizationalUnit.save(organizationalUnit);                                      

        return true;
    }
    
}
