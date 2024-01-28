package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TypeOfPostCommand;

public interface ICreateTypeOfPostUseCase {
    
    public boolean saveTypeOfPost(TypeOfPostCommand command);
}
