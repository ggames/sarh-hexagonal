package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;

public interface ISaveOrganizationalUnitPort {
    
    void save(OrganizationalUnit organizationalUnit);
}