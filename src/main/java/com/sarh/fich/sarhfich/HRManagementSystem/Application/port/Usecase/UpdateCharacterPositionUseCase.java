package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateCharacterPositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.CharacterPositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateCharacterPositionUseCase implements IUpdateCharacterPositionUseCase {

    private final ILoadCharacterPositionPort loadCbaracterPosition;

    private final IUpdateCharacterPositionPort updateCharacterPosition;

    public UpdateCharacterPositionUseCase(ILoadCharacterPositionPort loadCbaracterPosition,
            IUpdateCharacterPositionPort updateCharacterPosition ){
                this.loadCbaracterPosition = loadCbaracterPosition;
                this.updateCharacterPosition = updateCharacterPosition;
            }

    @Override
    public boolean updateCharecterPosition(Long id, CharacterPositionCommand command) {
     
          CharacterPosition characterPosition = loadCbaracterPosition.load(id);

          characterPosition.setCharacterPosition(command.getCharacterPosition());
          characterPosition.setName(command.getName());
                           
           updateCharacterPosition.update(characterPosition);                           

          return true;

    }
    
}
