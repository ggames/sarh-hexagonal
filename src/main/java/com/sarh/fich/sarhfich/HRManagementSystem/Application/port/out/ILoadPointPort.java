package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

public interface ILoadPointPort {
    
    Point load(Long id);
}
