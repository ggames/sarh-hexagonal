package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TypeOfPostCommand;

public interface ICreateTypeOfPostUseCase {
    
    public boolean saveTypeOfPost(TypeOfPostCommand command);
}
