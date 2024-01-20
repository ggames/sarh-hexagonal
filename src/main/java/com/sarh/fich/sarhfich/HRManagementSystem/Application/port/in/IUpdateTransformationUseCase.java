package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TransformationCommand;

public interface IUpdateTransformationUseCase {

    public boolean updateTransformation(Long id, TransformationCommand command);
    
}
