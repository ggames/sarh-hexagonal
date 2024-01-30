package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.OrganizationalSubunitCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/organizationalsubunit")
public class OrganizationalSubunitController {

    private final ICreateOrganizationalSubunitUseCase saveOrganitionalSubunit;

    private final IUpdateOrganizationalSubunitUseCase updateOrganizationalSubunit;

    private final IRetrieveOrganizationalSubunitUseCase retrieveOrganizationalSubunit;

    public OrganizationalSubunitController(ICreateOrganizationalSubunitUseCase saveOrganitionalSubunit,
                                           IUpdateOrganizationalSubunitUseCase updateOrganizationalSubunit,
                                           IRetrieveOrganizationalSubunitUseCase retrieveOrganizationalSubunit) {
        this.saveOrganitionalSubunit = saveOrganitionalSubunit;
        this.updateOrganizationalSubunit = updateOrganizationalSubunit;
        this.retrieveOrganizationalSubunit = retrieveOrganizationalSubunit;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody OrganizationalSubunit organizationalSubunit){

        OrganizationalSubunitCommand command = OrganizationalSubunitCommand.builder()
                .nameSubunit(organizationalSubunit.getNameSubunit())
                .guaraniCode(organizationalSubunit.getGuaraniCode())
                .organizationalUnit(organizationalSubunit.getOrganizationalUnit())
                .build();

        saveOrganitionalSubunit.saveOrganizationalSubUnit(command);
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable Long id,@RequestBody OrganizationalSubunit organizationalSubunit){

        OrganizationalSubunitCommand command = OrganizationalSubunitCommand.builder()
                .nameSubunit(organizationalSubunit.getNameSubunit())
                .guaraniCode(organizationalSubunit.getGuaraniCode())
                .organizationalUnit(organizationalSubunit.getOrganizationalUnit()).build();

        updateOrganizationalSubunit.updateOrganizationalSubUnit(id, command);
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OrganizationalSubunit>> getAll(){

        return ResponseEntity.ok(retrieveOrganizationalSubunit.getAllOrganizationalSubunit());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrganizationalSubunit> getOrganizationalSubunitById(@PathVariable Long id){

        return  ResponseEntity.ok(retrieveOrganizationalSubunit.getOrganizationalSubunitById(id));
    }

}
