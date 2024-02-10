package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;

public interface ILoadPostStatusPort {
    
    PostStatus load(Long id);
}
