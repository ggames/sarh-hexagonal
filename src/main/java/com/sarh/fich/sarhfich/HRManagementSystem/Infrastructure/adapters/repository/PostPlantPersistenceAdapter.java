package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostPlantEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PostPlantMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class PostPlantPersistenceAdapter implements ILoadPostPlantPort,
        ISavePostPlantPort, IUpdatePostPlantPort, IRetrievePostPlantPort {

    private final PostPlantRepository postPlantRepository;

    private final PostPlantMapper postPlantMapper;

    public PostPlantPersistenceAdapter(PostPlantRepository postPlantRepository,
                       PostPlantMapper postPlantMapper){
        this.postPlantRepository = postPlantRepository;
        this.postPlantMapper = postPlantMapper;
    }

    @Override
    public PostPlant load(Long id) {

        PostPlantEntity postPlantEntity = postPlantRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return postPlantMapper.toDto(postPlantEntity);
    }

    @Override
    public void save(PostPlant postPlant) {

        PostPlantEntity postPlantEntity = postPlantMapper.toEntity(postPlant);

        postPlantRepository.save(postPlantEntity);
    }

    @Override
    public void update(PostPlant postPlant) {

        PostPlantEntity postPlantEntity = postPlantMapper.toEntity(postPlant);

        postPlantRepository.save(postPlantEntity);
    }

    @Override
    public List<PostPlant> fetchAll() {

        List<PostPlantEntity> postPlantList = postPlantRepository.findAll();

        return postPlantMapper.toDto(postPlantList);
    }

    @Override
    public PostPlant fetchById(Long id) {
        PostPlantEntity postPlantEntity = postPlantRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return postPlantMapper.toDto(postPlantEntity);
    }

    @Override
    public List<PostPlant> fetchByAgent(Agent agent) {
        List<PostPlantEntity> postPlantList = postPlantRepository.findByAgent(agent);

        return postPlantMapper.toDto(postPlantList);
    }
}
