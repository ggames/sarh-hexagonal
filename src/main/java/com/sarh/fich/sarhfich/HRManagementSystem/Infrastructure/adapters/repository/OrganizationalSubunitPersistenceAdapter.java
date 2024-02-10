package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateOrganizationalSubunitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalSubunitEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.OrganizationalSubunitMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class OrganizationalSubunitPersistenceAdapter implements ILoadOrganizationalSubunitPort,
ISaveOrganizationalSubunitPort, IUpdateOrganizationalSubunitPort, IRetrieveOrganizationalSubunitPort {

    private final OrganizationalSubunitRepository oSubunitRepository;

    private final OrganizationalSubunitMapper oSubunitMapper;

    public OrganizationalSubunitPersistenceAdapter(OrganizationalSubunitRepository oRepository,
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

    @Override
    public List<OrganizationalSubunit> fetchAll() {

        List<OrganizationalSubunitEntity> organizationalSubunitEntityList = oSubunitRepository.findAll();

        return oSubunitMapper.toDto(organizationalSubunitEntityList);
    }

    @Override
    public OrganizationalSubunit fetchById(Long id) {

        OrganizationalSubunitEntity organizationalSubunit = oSubunitRepository.findById(id).orElseThrow(RuntimeException::new);

        return oSubunitMapper.toDto(organizationalSubunit);
    }
}
