package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TypeOfPostCommand;

public interface IUpdateTypeOfPostUseCase {
    
    public boolean updateTypeOfPost(Long id, TypeOfPostCommand command);
}
