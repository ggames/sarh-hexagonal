package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;

public interface ILoadCbaracterPositionPort {
    
    CharacterPosition load(Long id);
}
