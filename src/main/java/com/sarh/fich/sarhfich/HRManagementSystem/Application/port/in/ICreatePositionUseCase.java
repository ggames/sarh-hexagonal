package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PositionCommand;

public interface ICreatePositionUseCase {
    
    public boolean savePosition(PositionCommand command);
}
