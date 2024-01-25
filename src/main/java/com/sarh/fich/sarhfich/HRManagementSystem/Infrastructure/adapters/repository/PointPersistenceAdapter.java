package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISavePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdatePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PointEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PointMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

@PersistenceAdapter
public class PointPersistenceAdapter implements ILoadPointPort, ISavePointPort, IUpdatePointPort {

    private final PointRepository pointRepository;

    private final PointMapper pointMapper;

    public PointPersistenceAdapter(PointRepository pointRepository, PointMapper pointMapper){

        this.pointRepository = pointRepository;
        this.pointMapper = pointMapper;
    }

    @Override
    public void update(Point point) {
         
        PointEntity pointEntity = pointMapper.toEntity(point);
          
        pointRepository.save(pointEntity);
    }

    @Override
    public void save(Point point) {
        
        PointEntity pointEntity = pointMapper.toEntity(point);
          
        pointRepository.save(pointEntity);
    }

    @Override
    public Point load(Long id) {
        
        PointEntity pointEntity = pointRepository.findById(id).orElseThrow(RuntimeException::new);

        return pointMapper.toDto(pointEntity);

    }
    
}
