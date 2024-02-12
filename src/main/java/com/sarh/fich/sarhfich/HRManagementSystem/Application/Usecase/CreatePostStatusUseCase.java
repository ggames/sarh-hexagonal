package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostStatusCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@UseCase
public class CreatePostStatusUseCase implements ICreatePostStatusUseCase {
 
    private final ISavePostStatusPort savePostStatusPort;

    Logger logger = LoggerFactory.getLogger(CreatePostStatusUseCase.class);
    public CreatePostStatusUseCase(ISavePostStatusPort savePostStatusPort){
        
        this.savePostStatusPort = savePostStatusPort;
    }

    @Override
    public boolean savePostStatus(PostStatusCommand command) {
        
        PostStatus postStatus = PostStatus.builder()
                        .postStatus(command.getPostStatus())
                        .name(command.getName()).build();

        logger.error("Estado: " + command.getPostStatus() + "  nombre de Estado: " + command.getName());
        savePostStatusPort.save(postStatus);

        return true;
    }
    
}
