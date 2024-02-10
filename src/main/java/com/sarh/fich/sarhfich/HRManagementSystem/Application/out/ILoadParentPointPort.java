package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;

public interface ILoadParentPointPort {
    
    ParentPoint load(Long id);
}
