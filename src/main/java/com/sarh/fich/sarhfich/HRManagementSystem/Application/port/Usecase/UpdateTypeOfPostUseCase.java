package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TypeOfPostCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

public class UpdateTypeOfPostUseCase implements IUpdateTypeOfPostUseCase{

    private final ILoadTypeOfPostPort loadTypeOfPost;

    private final IUpdateTypeOfPostPort updateTypeOfPost;

    public  UpdateTypeOfPostUseCase(ILoadTypeOfPostPort loadTypeOfPost, 
    IUpdateTypeOfPostPort updateTypeOfPost){
        this.loadTypeOfPost = loadTypeOfPost;
        this.updateTypeOfPost = updateTypeOfPost;
    }

    @Override
    public boolean updateTypeOfPost(Long id, TypeOfPostCommand command) {
       
        TypeOfPost  typeOfPost = loadTypeOfPost.load(id);

        typeOfPost.setNamePost(command.getNamePost());
        typeOfPost.setMinimumWage(command.getMinimumWage());
        typeOfPost.setAmountOfPostPoint(command.getAmountOfPostPoint());

        updateTypeOfPost.update(typeOfPost);

        return true;
    }
    
}
