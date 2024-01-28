package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostStatusCommand;

public interface IUpdatePostStatusUseCase {
    
    public boolean updatePostStatus(Long id, PostStatusCommand command);
}
