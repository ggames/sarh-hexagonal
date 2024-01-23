package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;

public interface ILoadOrganizationalSubunitPort {

    OrganizationalSubunit load(Long id);
    
}
