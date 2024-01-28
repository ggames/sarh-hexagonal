package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostPlantEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PostPlantMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class PostPlantPersistenceAdapter implements ILoadPostPlantPort,
        ISavePostPlantPort, IUpdatePostPlantPort {

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
}
