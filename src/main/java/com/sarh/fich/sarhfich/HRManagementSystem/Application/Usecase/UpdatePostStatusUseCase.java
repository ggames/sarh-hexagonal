package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostStatusCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
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
                 
                  postStatus.setNamePostStatus(command.getNamePostStatus());

                  postStatus.setPostStatus(command.getPostStatus());
                  
                  updatePostStatus.update(postStatus);
         return true; 
    }
    
}
