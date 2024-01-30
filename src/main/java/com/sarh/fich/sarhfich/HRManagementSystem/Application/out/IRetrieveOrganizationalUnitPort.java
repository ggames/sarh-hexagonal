package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;

import java.util.List;

public interface IRetrieveOrganizationalUnitPort {

    List<OrganizationalUnit> fetchAll();

    OrganizationalUnit fetchById(Long id);
}
