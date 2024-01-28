package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.CharacterPositionCommand;

public interface IUpdateCharacterPositionUseCase {
    
    public boolean updateCharecterPosition(Long id, CharacterPositionCommand command);
}
