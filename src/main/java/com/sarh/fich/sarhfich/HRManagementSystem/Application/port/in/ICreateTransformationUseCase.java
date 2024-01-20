package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TransformationCommand;

public interface ICreateTransformationUseCase {

    public boolean createTransformation(TransformationCommand command);
    
}
