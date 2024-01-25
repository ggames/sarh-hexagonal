package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PointCommand;

public interface ICreatePointUseCase {
    
    public boolean savePoint(PointCommand command);
}
