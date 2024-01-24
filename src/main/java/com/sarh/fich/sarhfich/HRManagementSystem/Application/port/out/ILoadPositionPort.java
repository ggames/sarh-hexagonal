package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Position;

public interface ILoadPositionPort {
    
    Position load(Long id);
}
