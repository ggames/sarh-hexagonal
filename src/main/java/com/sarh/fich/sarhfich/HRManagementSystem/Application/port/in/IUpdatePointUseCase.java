package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PointCommand;

public interface IUpdatePointUseCase {
    
    public boolean updatePoint(Long id, PointCommand command);
}
