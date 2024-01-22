package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.CharacterPositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadCbaracterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;

public class UpdateCharacterPositionUseCase implements IUpdateCharacterPositionUseCase {

    private final ILoadCbaracterPositionPort loadCbaracterPosition;

    private final IUpdateCharacterPositionPort updateCharacterPosition;

    public UpdateCharacterPositionUseCase(ILoadCbaracterPositionPort loadCbaracterPosition,
            IUpdateCharacterPositionPort updateCharacterPosition ){
                this.loadCbaracterPosition = loadCbaracterPosition;
                this.updateCharacterPosition = updateCharacterPosition;
            }

    @Override
    public boolean updateCharecterPosition(Long id, CharacterPositionCommand command) {
     
          CharacterPosition characterPosition = loadCbaracterPosition.load(id);

          characterPosition.setCharacterPosition(command.getCharacterPosition());
          characterPosition.setName(command.getName());
                           
           updateCharacterPosition.updateCharecterPosition(characterPosition);                           

          return true;

    }
    
}
