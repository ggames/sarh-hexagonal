package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;

public interface ILoadTransformationPort {

    Transformation load(Long id);
    
}
