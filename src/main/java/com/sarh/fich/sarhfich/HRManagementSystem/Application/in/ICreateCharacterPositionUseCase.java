package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.CharacterPositionCommand;

public interface ICreateCharacterPositionUseCase {
    
    public boolean saveCharacterPosition(CharacterPositionCommand command);
}
