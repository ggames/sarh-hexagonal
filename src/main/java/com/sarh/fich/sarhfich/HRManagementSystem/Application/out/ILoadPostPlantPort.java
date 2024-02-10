package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;

public interface ILoadPostPlantPort {
    
    PostPlant load(Long id);
}
