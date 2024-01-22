package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.CharacterPositionCommand;

public interface ICreateCharacterPositionUseCase {
    
    public boolean createCharacterPosition(CharacterPositionCommand command);
}
