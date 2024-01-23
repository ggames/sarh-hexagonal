package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateCharacterPositionUseCase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.CharacterPositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateCharacterPositionUseCase  implements ICreateCharacterPositionUseCase {

    private final ISaveCharacterPositionPort saveCharacterPosition;

    public CreateCharacterPositionUseCase(ISaveCharacterPositionPort saveCharacterPosition){
        this.saveCharacterPosition = saveCharacterPosition;
    }

    @Override
    public boolean createCharacterPosition(CharacterPositionCommand command) {
         
        CharacterPosition characterPosition = CharacterPosition.builder()
                .name(command.getName())
                .characterPosition(command.getCharacterPosition()).build();

        saveCharacterPosition.save(characterPosition);

        return true;
    }

   
    
}
