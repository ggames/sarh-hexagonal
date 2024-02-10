package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@UseCase
public class RetrieveCharacterPositionUseCase implements IRetrieveCharacterPositionUseCase {

    private final IRetrieveCharacterPositionPort retrieveCharacter;

    public RetrieveCharacterPositionUseCase(IRetrieveCharacterPositionPort retrieveCharacter) {
        this.retrieveCharacter = retrieveCharacter;
    }


    @Override
    public List<CharacterPosition> getAllCharactersPositions() {
        return retrieveCharacter.getAll();
    }

    @Override
    public CharacterPosition getCharacterPosition(Long id) {
        return retrieveCharacter.fetchById(id);
    }
}
