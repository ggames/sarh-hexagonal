package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TransformationEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.TransformationMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class TransformationPersistenceAdapter implements ILoadTransformationPort, 
 ISaveTransformationPort, IUpdateTransformationPort, IRetrieveTransformationPort {

    private final TransformationRepository transformationRepository;

    private final TransformationMapper transformationMapper;

    public TransformationPersistenceAdapter(TransformationRepository repository,
              TransformationMapper mapper ){
       
        this.transformationRepository = repository;
        this.transformationMapper = mapper;
    }

    @Override
    public Transformation load(Long id) {
        
        TransformationEntity transformation = transformationRepository.findById(id).orElseThrow(RuntimeException::new);

        return transformationMapper.toDto(transformation);
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

    @Override
    public List<Transformation> fetchAll() {
        List<TransformationEntity> transformationList = transformationRepository.findAll();

        return transformationMapper.toDto(transformationList);
    }

    @Override
    public Transformation fetchById(Long id) {
        TransformationEntity transformation = transformationRepository
                 .findById(id).orElseThrow(RuntimeException::new);
        return transformationMapper.toDto(transformation) ;
    }
}
