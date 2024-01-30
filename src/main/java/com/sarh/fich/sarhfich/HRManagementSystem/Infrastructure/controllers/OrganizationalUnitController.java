package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateOrganizationalUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveOrganizationUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateOrganizationalUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalUnitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping("/sarh/organizationalunit")
public class OrganizationalUnitController {

    private final ICreateOrganizationalUnitUseCase saveOrganizationalUnit;

    private final IUpdateOrganizationalUnitUseCase updateOrganizationalUnit;

    private final IRetrieveOrganizationUnitUseCase retrieveOrganizationalUnit;

    public OrganizationalUnitController(ICreateOrganizationalUnitUseCase saveOrganizationalUnit,
                                        IUpdateOrganizationalUnitUseCase updateOrganizationalUnit,
                                        IRetrieveOrganizationUnitUseCase retrieveOrganizationalUnit) {
        this.saveOrganizationalUnit = saveOrganizationalUnit;
        this.updateOrganizationalUnit = updateOrganizationalUnit;
        this.retrieveOrganizationalUnit = retrieveOrganizationalUnit;
    }

    @PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody OrganizationalUnit organizationalUnit){
        OrganizationalUnitCommand command = OrganizationalUnitCommand.builder()
                .nameUnit(organizationalUnit.getNameUnit())
                .director(organizationalUnit.getDirectorId())
                .vicePrincipal(organizationalUnit.getVicePrincipalId())
                .build();

        saveOrganizationalUnit.saveOrganizationalUnit(command);
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable Long id, @RequestBody OrganizationalUnit organizationalUnit){

        OrganizationalUnitCommand command = OrganizationalUnitCommand.builder()
                .nameUnit(organizationalUnit.getNameUnit())
                .director(organizationalUnit.getDirectorId())
                .vicePrincipal(organizationalUnit.getVicePrincipalId()).build();

        updateOrganizationalUnit.updateOrganizationalUnit(id, command);
    }


    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrganizationalUnit>> getAll(){

        return ResponseEntity.ok(retrieveOrganizationalUnit.getAllOrganizationalUnit());
    }

}
