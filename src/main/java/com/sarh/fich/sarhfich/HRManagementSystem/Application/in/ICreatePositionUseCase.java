package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PositionCommand;

public interface ICreatePositionUseCase {
    
    public boolean savePosition(PositionCommand command);
}
