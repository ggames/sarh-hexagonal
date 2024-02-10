package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalSubunit;

public interface ILoadOrganizationalSubunitPort {

    OrganizationalSubunit load(Long id);
    
}
