package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;

public interface ILoadPostPlantPort {
    
    PostPlant load(Long id);
}
