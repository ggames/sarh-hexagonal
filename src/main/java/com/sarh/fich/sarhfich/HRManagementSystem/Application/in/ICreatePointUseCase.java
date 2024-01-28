package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;

public interface ICreatePointUseCase {
    
    public boolean savePoint(PointCommand command);
}
