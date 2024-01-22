package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.CharacterPositionCommand;

public interface IUpdateCharacterPositionUseCase {
    
    public boolean updateCharecterPosition(Long id, CharacterPositionCommand command);
}
