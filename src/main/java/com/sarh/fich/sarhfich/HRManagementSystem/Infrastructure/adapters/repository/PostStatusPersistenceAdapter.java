package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadPostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISavePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdatePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostStatusEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PostStatusMapper;

public class PostStatusPersistenceAdapter implements ILoadPostStatusPort,
 ISavePostStatusPort, IUpdatePostStatusPort {

    private final PostStatusRepository statusRepository;

    private final PostStatusMapper statusMapper;

    public PostStatusPersistenceAdapter(PostStatusRepository statusRepository, 
    PostStatusMapper statusMapper){
        this.statusRepository = statusRepository;
        this.statusMapper = statusMapper;
    }

    @Override
    public PostStatus load(Long id) {
        
        PostStatusEntity statusEntity = statusRepository.findById(id)
        .orElseThrow(RuntimeException::new);

        return statusMapper.toDto(statusEntity);
    }

    @Override
    public void save(PostStatus postStatus) {
        
        PostStatusEntity statusEntity = statusMapper.toEntity(postStatus);
        
        statusRepository.save(statusEntity);
    }

    @Override
    public void update(PostStatus postStatus) {
       
        PostStatusEntity statusEntity = statusMapper.toEntity(postStatus);
        
        statusRepository.save(statusEntity); 
    }
    
}
