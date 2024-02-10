package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostPlantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostPlantRepository extends JpaRepository<PostPlantEntity, Long>{

    List<PostPlantEntity> findByAgent(Agent agent);
}