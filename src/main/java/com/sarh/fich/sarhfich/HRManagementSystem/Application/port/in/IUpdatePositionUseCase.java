package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PositionCommand;

public interface IUpdatePositionUseCase {
    
    public boolean updatePosition(Long id,PositionCommand command);
}
