package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;

public interface ISaveTransformationPort {

    void save(Transformation transformation);
    
}
