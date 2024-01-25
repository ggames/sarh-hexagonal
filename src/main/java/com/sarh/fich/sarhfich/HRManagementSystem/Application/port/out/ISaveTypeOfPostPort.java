package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

public interface ISaveTypeOfPostPort {
    
    void save(TypeOfPost typeOfPost);
}
