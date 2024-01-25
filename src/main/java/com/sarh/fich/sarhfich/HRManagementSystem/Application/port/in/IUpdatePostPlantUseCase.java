package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostPlantCommand;

public interface IUpdatePostPlantUseCase {
      
    public boolean updatePostPlant(Long id,PostPlantCommand command);
}
