package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;

import java.util.List;

public interface IRetrieveOrganizationalSubunitPort {

    List<OrganizationalSubunit> fetchAll();

    OrganizationalSubunit fetchById(Long id);
}
