package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.*;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.ParentPointEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.ParentPointMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class ParentPointPersistenceAdapter implements ILoadParentPointPort, ISaveParentPointPort,
        IUpdateParentPointPort, IRetrieveParentPointPort {

    private final ParentPointRepository parentPointRepository;

    private final ParentPointMapper parentPointMapper;

    public ParentPointPersistenceAdapter(ParentPointRepository parentPointRepository,
                                         ParentPointMapper parentPointMapper) {
        this.parentPointRepository = parentPointRepository;
        this.parentPointMapper = parentPointMapper;
    }

    @Override
    public ParentPoint load(Long id) {
        ParentPointEntity parentPoint = parentPointRepository.findById(id).orElseThrow(RuntimeException::new);

        return parentPointMapper.toDto(parentPoint);
    }

    @Override
    public List<ParentPoint> fetchAll() {
        List<ParentPointEntity> parentPointList = parentPointRepository.findAll();

        return parentPointMapper.toDto(parentPointList);
    }

    @Override
    public ParentPoint fetchById(Long id) {
        ParentPointEntity parentPoint = parentPointRepository.findById(id).orElseThrow(RuntimeException::new);

        return parentPointMapper.toDto(parentPoint);
    }

    @Override
    public void save(ParentPoint parentPoint) {
        ParentPointEntity parentPointEntity = parentPointMapper.toEntity(parentPoint);
        parentPointRepository.save(parentPointEntity);
    }

    @Override
    public void update(ParentPoint parentPoint) {
        ParentPointEntity parentPointEntity = parentPointMapper.toEntity(parentPoint);
        parentPointRepository.save(parentPointEntity);
    }
}
