package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;

public interface ISavePostStatusPort {
    
    void save(PostStatus postStatus);
}
