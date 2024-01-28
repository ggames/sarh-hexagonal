package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TypeOfPostCommand;

public interface IUpdateTypeOfPostUseCase {
    
    public boolean updateTypeOfPost(Long id, TypeOfPostCommand command);
}
