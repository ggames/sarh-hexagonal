package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.OrganizationalUnitEntity;


public interface OrganizationalUnitRepository extends JpaRepository<OrganizationalUnitEntity, Long> {
    
}
