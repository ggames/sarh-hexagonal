package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TransformationCommand;

public interface IUpdateTransformationUseCase {

    public boolean updateTransformation(Long id, TransformationCommand command);
    
}
