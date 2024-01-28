package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalSubunitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateOrganizationalSubunitUseCase implements ICreateOrganizationalSubunitUseCase {

    @Autowired
    private  ISaveOrganizationalSubunitPort saveOrganizationalSubunit;

   /*  public CreateOrganizationalSubunitUseCase(ISaveOrganizationalSubunitPort saveOrganizationalSubunit){

        this.saveOrganizationalSubunit = saveOrganizationalSubunit;
    }
 */
    @Override
    public boolean saveOrganizationalSubUnit(OrganizationalSubunitCommand command) {
        
         OrganizationalSubunit oSubunit = OrganizationalSubunit.builder()
                               .guaraniCode(command.getGuaraniCode())
                               .nameSubunit(command.getNameSubunit())
                               .organizationalUnit(command.getOrganizationalUnit()).build();

         saveOrganizationalSubunit.save(oSubunit);                      
                            

        return true;
    }
    
}
