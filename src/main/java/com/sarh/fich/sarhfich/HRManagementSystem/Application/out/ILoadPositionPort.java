package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;

public interface ILoadPositionPort {
    
    Position load(Long id);
}
