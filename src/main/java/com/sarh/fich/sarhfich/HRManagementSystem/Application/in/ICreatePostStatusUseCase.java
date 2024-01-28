package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostStatusCommand;

public interface ICreatePostStatusUseCase {
    
    public boolean savePostStatus( PostStatusCommand command);
}
