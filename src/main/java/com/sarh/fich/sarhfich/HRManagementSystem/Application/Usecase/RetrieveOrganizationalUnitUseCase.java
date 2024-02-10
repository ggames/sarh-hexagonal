package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveOrganizationUnitUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@UseCase
public class RetrieveOrganizationalUnitUseCase implements IRetrieveOrganizationUnitUseCase {

    private final IRetrieveOrganizationalUnitPort retrieveOrganizationalUnit;

    public RetrieveOrganizationalUnitUseCase(IRetrieveOrganizationalUnitPort retrieveOrganizationalUnit) {
        this.retrieveOrganizationalUnit = retrieveOrganizationalUnit;
    }

    @Override
    public List<OrganizationalUnit> getAllOrganizationalUnit() {

        return retrieveOrganizationalUnit.fetchAll();
    }

    @Override
    public OrganizationalUnit getOrganizationalUnitById(Long id) {

        return retrieveOrganizationalUnit.fetchById(id);
    }
}
