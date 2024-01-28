package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PositionCommand;

public interface IUpdatePositionUseCase {
    
    public boolean updatePosition(Long id, PositionCommand command);
}
