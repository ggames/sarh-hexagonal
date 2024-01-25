package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdatePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostStatusCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadPostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdatePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdatePostStatusUseCase implements IUpdatePostStatusUseCase {

    private final ILoadPostStatusPort loadPostStatus;

    private final IUpdatePostStatusPort updatePostStatus;

    public UpdatePostStatusUseCase(ILoadPostStatusPort loadPostStatus,
     IUpdatePostStatusPort updatePostStatus ){
         this.loadPostStatus = loadPostStatus;
         this.updatePostStatus = updatePostStatus;
     }

    @Override
    public boolean updatePostStatus(Long id, PostStatusCommand command) {

        PostStatus postStatus = loadPostStatus.load(id);
                 
                  postStatus.setName(command.getName());

                  postStatus.setPostStatus(command.getPostStatus());
                  
                  updatePostStatus.update(postStatus);
         return true; 
    }
    
}
