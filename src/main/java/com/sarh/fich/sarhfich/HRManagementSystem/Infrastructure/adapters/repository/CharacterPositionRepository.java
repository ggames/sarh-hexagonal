package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.CharacterPositionEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.CharacterPositionEntity;

import java.util.Optional;

public interface CharacterPositionRepository extends JpaRepository<CharacterPositionEntity, Long> {
    Optional<CharacterPositionEntity> findByCharacterPosition(CharacterPositionEnum characterEnum);
}
