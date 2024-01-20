package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TransformationEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.TransformationMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class TransformationPersistenceAdapter implements ILoadTransformationPort, 
 ISaveTransformationPort, IUpdateTransformationPort{

    private TransformationRepository transformationRepository;

    private TransformationMapper transformationMapper;

    public TransformationPersistenceAdapter(TransformationRepository repository,
              TransformationMapper mapper ){
       
        this.transformationRepository = repository;
        this.transformationMapper = mapper;
    }

    @Override
    public Transformation load(Long id) {
        
        TransformationEntity tranformation = transformationRepository.findById(id).orElseThrow(RuntimeException::new);

        return transformationMapper.toDto(tranformation);
    }

    @Override
    public void save(Transformation transformation) {
        TransformationEntity transformationEntity = transformationMapper.toEntity(transformation);
        transformationRepository.save(transformationEntity);
    }

    @Override
    public void update(Transformation transformation) {
        TransformationEntity transformationEntity = transformationMapper.toEntity(transformation);
        transformationRepository.save(transformationEntity);
    }
    
}
