package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

public interface ILoadTypeOfPostPort {
    
    TypeOfPost load(Long id);
}
