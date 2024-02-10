package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.CharacterPosition;

import java.util.List;

public interface IRetrieveCharacterPositionPort {

      List<CharacterPosition> getAll();

      CharacterPosition fetchById(Long id);

}
