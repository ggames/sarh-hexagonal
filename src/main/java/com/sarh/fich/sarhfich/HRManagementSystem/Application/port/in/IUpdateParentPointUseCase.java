package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.ParentPointCommand;

public interface IUpdateParentPointUseCase {
    
    public boolean updateParentPoint(Long id, ParentPointCommand command);
}
