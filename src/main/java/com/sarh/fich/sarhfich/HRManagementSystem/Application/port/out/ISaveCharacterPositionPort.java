package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;

public interface ISaveCharacterPositionPort {
    
    public void save(CharacterPosition characterPosition);
}
