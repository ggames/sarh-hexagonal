package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostStatusCommand;

public interface ICreatePostStatusUseCase {
    
    public boolean savePostStatus( PostStatusCommand command);
}
