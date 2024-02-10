package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.TypeOfPost;

public interface ILoadTypeOfPostPort {
    
    TypeOfPost load(Long id);
}
