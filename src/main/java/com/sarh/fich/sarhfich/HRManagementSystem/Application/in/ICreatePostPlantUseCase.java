package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostPlantCommand;

public interface ICreatePostPlantUseCase {
    
    public boolean savePostPlant(PostPlantCommand command);

}
