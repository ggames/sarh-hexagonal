package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.ParentPointCommand;

public interface ICreateParentPointUseCase {
    
    public boolean saveParentPoint(ParentPointCommand command);
}
