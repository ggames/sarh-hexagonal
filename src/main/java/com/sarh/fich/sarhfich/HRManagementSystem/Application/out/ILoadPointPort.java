package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

public interface ILoadPointPort {
    
    Point load(Long id);
}
