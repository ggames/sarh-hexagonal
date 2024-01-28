package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.CharacterPositionCommand;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateCharacterPositionUseCase  implements ICreateCharacterPositionUseCase {

    private final ISaveCharacterPositionPort saveCharacterPosition;

    public CreateCharacterPositionUseCase(ISaveCharacterPositionPort saveCharacterPosition){
        this.saveCharacterPosition = saveCharacterPosition;
    }

    @Override
    public boolean saveCharacterPosition(CharacterPositionCommand command) {
         
        CharacterPosition characterPosition = CharacterPosition.builder()
                .name(command.getNameCharacter())
                .characterPosition(command.getCharacterPosition()).build();

        saveCharacterPosition.save(characterPosition);

        return true;
    }

   
    
}
