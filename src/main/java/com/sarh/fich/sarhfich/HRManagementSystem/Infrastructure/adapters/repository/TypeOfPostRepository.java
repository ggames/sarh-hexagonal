package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TypeOfPostEntity;

public interface TypeOfPostRepository extends JpaRepository<TypeOfPostEntity, Long> {
    
}
