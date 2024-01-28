package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TransformationCommand;

public interface ICreateTransformationUseCase {

    public boolean createTransformation(TransformationCommand command);
    
}
