package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostPlantCommand;

public interface IUpdatePostPlantUseCase {
      
    public boolean updatePostPlant(Long id, PostPlantCommand command);
}
