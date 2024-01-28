package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostPlantCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreatePostPlantUseCase implements ICreatePostPlantUseCase {

    private final ISavePostPlantPort savePostPlant;

    public CreatePostPlantUseCase(ISavePostPlantPort savePostPlant){

        this.savePostPlant = savePostPlant;
    }

    @Override
    public boolean savePostPlant(PostPlantCommand command) {
        
        PostPlant postPlant = PostPlant.builder()
                                       .agent(command.getAgent())
                                       .organizationalSubunit(command.getOrganizationalSubunit())
                                       .position(command.getPosition())
                                       .movementDate(command.getMovementDate())
                                       .movementMotive(command.getMovementMotive())
                                       .startDate(command.getStartDate())
                                       .startResolution(command.getStartResolution())
                                       .terminationDate(command.getTerminationDate())
                                       .build();
         
        savePostPlant.save(postPlant);                               

        return true;
    }
    
}
