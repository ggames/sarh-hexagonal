package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreatePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostStatusCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISavePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreatePostStatusUseCase implements ICreatePostStatusUseCase{
 
    private final ISavePostStatusPort savePostStatusPort;

    public CreatePostStatusUseCase(ISavePostStatusPort savePostStatusPort){
        
        this.savePostStatusPort = savePostStatusPort;
    }

    @Override
    public boolean savePostStatus(PostStatusCommand command) {
        
        PostStatus postStatus = PostStatus.builder()
                                .name(command.getName())
                                .postStatus(command.getPostStatus()).build();  
        savePostStatusPort.save(postStatus);

        return true;
    }
    
}
