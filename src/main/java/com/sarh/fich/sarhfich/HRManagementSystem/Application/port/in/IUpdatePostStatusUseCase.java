package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostStatusCommand;

public interface IUpdatePostStatusUseCase {
    
    public boolean updatePostStatus(Long id, PostStatusCommand command);
}
