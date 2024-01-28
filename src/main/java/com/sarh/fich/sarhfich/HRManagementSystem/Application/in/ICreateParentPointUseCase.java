package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;

public interface ICreateParentPointUseCase {
    
    public boolean saveParentPoint(ParentPointCommand command);
}
