package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;

public interface ILoadPostStatusPort {
    
    PostStatus load(Long id);
}
