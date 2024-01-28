package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;

public interface IUpdateParentPointUseCase {
    
    public boolean updateParentPoint(Long id, ParentPointCommand command);
}
