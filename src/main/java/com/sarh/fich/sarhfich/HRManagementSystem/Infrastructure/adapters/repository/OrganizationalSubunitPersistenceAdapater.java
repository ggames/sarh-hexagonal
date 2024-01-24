package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalSubunitEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.OrganizationalSubunitMapper;

public class OrganizationalSubunitPersistenceAdapater implements ILoadOrganizationalSubunitPort,
ISaveOrganizationalSubunitPort, IUpdateOrganizationalSubunitPort{

    private final OrganizationalSubunitRepository oSubunitRepository;

    private final OrganizationalSubunitMapper oSubunitMapper;

    public OrganizationalSubunitPersistenceAdapater(OrganizationalSubunitRepository oRepository,
     OrganizationalSubunitMapper oMapper ){
           this.oSubunitRepository = oRepository;
           this.oSubunitMapper = oMapper;
    }

    @Override
    public OrganizationalSubunit load(Long id) {
        
        OrganizationalSubunitEntity organizationalSubunit = oSubunitRepository.findById(id)
                  .orElseThrow(RuntimeException::new);

        return oSubunitMapper.toDto(organizationalSubunit);
    }

    @Override
    public void save(OrganizationalSubunit oSubunit) {
        
        OrganizationalSubunitEntity organizationalSubunit = oSubunitMapper.toEntity(oSubunit);
        
        oSubunitRepository.save(organizationalSubunit);
    }
    @Override
    public void update(OrganizationalSubunit oSubunit) {
        
        OrganizationalSubunitEntity organizationalSubunit = oSubunitMapper.toEntity(oSubunit);
        
        oSubunitRepository.save(organizationalSubunit);
    }
    
}
