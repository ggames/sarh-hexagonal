package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;

public interface ILoadParentPointPort {
    
    ParentPoint load(Long id);
}
