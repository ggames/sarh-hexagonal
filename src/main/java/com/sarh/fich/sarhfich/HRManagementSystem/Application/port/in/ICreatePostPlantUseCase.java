package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostPlantCommand;

public interface ICreatePostPlantUseCase {
    
    public boolean savePostPlant(PostPlantCommand command);

}
