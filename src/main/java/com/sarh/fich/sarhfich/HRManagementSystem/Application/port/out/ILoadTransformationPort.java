package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;

public interface ILoadTransformationPort {

    Transformation load(Long id);
    
}
