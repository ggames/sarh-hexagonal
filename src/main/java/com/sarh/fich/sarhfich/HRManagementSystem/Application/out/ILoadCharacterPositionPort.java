package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.CharacterPosition;

public interface ILoadCharacterPositionPort {
    
    CharacterPosition load(Long id);
}
