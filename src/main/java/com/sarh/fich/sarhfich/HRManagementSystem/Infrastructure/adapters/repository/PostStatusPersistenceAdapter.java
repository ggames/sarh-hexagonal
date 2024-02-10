package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.AgentEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostStatusEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.AgentMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PostStatusMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class PostStatusPersistenceAdapter implements ILoadPostStatusPort,
 ISavePostStatusPort, IUpdatePostStatusPort, IRetrievePostStatusPort {

    private final PostStatusRepository statusRepository;
    private final PostStatusMapper statusMapper;

    private final AgentMapper agentMapper;
    public PostStatusPersistenceAdapter(PostStatusRepository statusRepository,
                                        PostStatusMapper statusMapper, AgentMapper agentMapper){
        this.statusRepository = statusRepository;
        this.statusMapper = statusMapper;
        this.agentMapper = agentMapper;
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

    @Override
    public List<PostStatus> fetchAll() {
        List<PostStatusEntity> postStatusList = statusRepository.findAll();

        return statusMapper.toDto(postStatusList);
    }

    @Override
    public PostStatus fetchById(Long id) {

        PostStatusEntity postStatus = statusRepository.findById(id).orElseThrow(RuntimeException::new);

        return statusMapper.toDto(postStatus);
    }

    @Override
    public PostStatus fetchByPostStatus(String poststatus) {

        PostStatusEntity postStatus = statusRepository.findByPostStatus(poststatus);
        return  statusMapper.toDto(postStatus) ;
    }
}
