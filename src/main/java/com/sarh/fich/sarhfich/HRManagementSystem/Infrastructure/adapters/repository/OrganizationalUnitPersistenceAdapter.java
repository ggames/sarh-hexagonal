package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateOrganizationalUnitPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalUnitEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.OrganizationalUnitMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class OrganizationalUnitPersistenceAdapter implements ILoadOrganizationalUnitPort,
ISaveOrganizationalUnitPort, IUpdateOrganizationalUnitPort{

    private OrganizationalUnitRepository organizationalUnitRepository;

    private OrganizationalUnitMapper organizationalUnitMapper;

    public OrganizationalUnitPersistenceAdapter(OrganizationalUnitRepository oRepository,
      OrganizationalUnitMapper mapper){
          this.organizationalUnitRepository = oRepository;
          this.organizationalUnitMapper = mapper;
    }

    @Override
    public void update(OrganizationalUnit organizationalUnit) {
        
        OrganizationalUnitEntity oEntity = organizationalUnitMapper.toEntity(organizationalUnit);

        organizationalUnitRepository.save(oEntity);
    }

    @Override
    public void save(OrganizationalUnit organizationalUnit) {
       
        OrganizationalUnitEntity oEntity = organizationalUnitMapper.toEntity(organizationalUnit);

        organizationalUnitRepository.save(oEntity);

    }

    @Override
    public OrganizationalUnit load(Long id) {

          OrganizationalUnitEntity oUnitEntity = organizationalUnitRepository
                     .findById(id).orElseThrow(RuntimeException::new);

          return organizationalUnitMapper.toDto(oUnitEntity);           
    }
    
}
