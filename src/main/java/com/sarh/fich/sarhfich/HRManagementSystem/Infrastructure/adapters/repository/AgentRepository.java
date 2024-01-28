package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.AgentEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface AgentRepository extends JpaRepository<AgentEntity, Long>{

    @Query("SELECT a FROM AgentEntity a WHERE document = ?1")
    Optional<AgentEntity> findByDocument(String document);
    
}
