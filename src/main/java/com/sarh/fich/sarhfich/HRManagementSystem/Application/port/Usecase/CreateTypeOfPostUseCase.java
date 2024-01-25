package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TypeOfPostCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateTypeOfPostUseCase implements ICreateTypeOfPostUseCase {

    private final ISaveTypeOfPostPort saveTypeOfPost;

    public CreateTypeOfPostUseCase(ISaveTypeOfPostPort saveTypeOfPost) {

        this.saveTypeOfPost = saveTypeOfPost;
    }

    @Override
    public boolean saveTypeOfPost(TypeOfPostCommand command) {

        TypeOfPost typeOfPost = TypeOfPost.builder()
                .namePost(command.getNamePost())
                .minimumWage(command.getMinimumWage())
                .amountOfPostPoint(command.getAmountOfPostPoint())
                .build();
        saveTypeOfPost.save(typeOfPost);

        return true;
    }

}
