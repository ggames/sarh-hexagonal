package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TransformationEntity;

public interface TransformationRepository extends JpaRepository<TransformationEntity, Long> {
    
}
