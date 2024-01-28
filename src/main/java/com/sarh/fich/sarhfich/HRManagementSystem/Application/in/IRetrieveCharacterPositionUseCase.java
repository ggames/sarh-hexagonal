package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;

import java.util.List;

public interface IRetrieveCharacterPositionUseCase {

    List<CharacterPosition> getAllCharactersPositions();

    CharacterPosition getCharacterPosition(Long id);
}
