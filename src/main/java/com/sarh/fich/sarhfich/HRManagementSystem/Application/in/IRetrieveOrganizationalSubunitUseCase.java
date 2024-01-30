package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;

import java.util.List;

public interface IRetrieveOrganizationalSubunitUseCase {
    List<OrganizationalSubunit> getAllOrganizationalSubunit();

    OrganizationalSubunit getOrganizationalSubunitById(Long id);
}
