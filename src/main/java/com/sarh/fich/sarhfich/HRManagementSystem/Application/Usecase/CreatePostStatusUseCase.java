package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostStatusCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreatePostStatusUseCase implements ICreatePostStatusUseCase {
 
    private final ISavePostStatusPort savePostStatusPort;

    public CreatePostStatusUseCase(ISavePostStatusPort savePostStatusPort){
        
        this.savePostStatusPort = savePostStatusPort;
    }

    @Override
    public boolean savePostStatus(PostStatusCommand command) {
        
        PostStatus postStatus = new PostStatus();
                               postStatus.setNamePostStatus(command.getNamePostStatus());
                               postStatus.setPostStatus(command.getPostStatus());
        savePostStatusPort.save(postStatus);

        return true;
    }
    
}
