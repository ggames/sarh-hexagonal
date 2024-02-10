package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalUnit;

import java.util.List;

public interface IRetrieveOrganizationUnitUseCase {

    List<OrganizationalUnit> getAllOrganizationalUnit();

   OrganizationalUnit getOrganizationalUnitById(Long id);
}
