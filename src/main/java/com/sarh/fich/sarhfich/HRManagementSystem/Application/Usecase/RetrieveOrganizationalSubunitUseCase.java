package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveOrganizationalSubunitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrieveOrganizationalSubunitUseCase implements IRetrieveOrganizationalSubunitUseCase {

    private final IRetrieveOrganizationalSubunitPort retrieveOrganizationalSubunit;

    public RetrieveOrganizationalSubunitUseCase(IRetrieveOrganizationalSubunitPort retrieveOrganizationalSubunit) {
        this.retrieveOrganizationalSubunit = retrieveOrganizationalSubunit;
    }

    @Override
    public List<OrganizationalSubunit> getAllOrganizationalSubunit() {

        return retrieveOrganizationalSubunit.fetchAll();
    }

    @Override
    public OrganizationalSubunit getOrganizationalSubunitById(Long id) {

        return retrieveOrganizationalSubunit.fetchById(id);
    }
}
