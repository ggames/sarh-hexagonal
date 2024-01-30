package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PositionEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.PositionMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class PositionPersistenceAdapter implements ILoadPositionPort, ISavePositionPort,
IUpdatePositionPort, IRetrievePositionPort {

    private final PositionRepository positionRepository;

    private final PositionMapper positionMapper;

    public PositionPersistenceAdapter(PositionRepository positionRepository, 
               PositionMapper positionMapper){
            this.positionRepository = positionRepository;
            this.positionMapper = positionMapper;
    }

    @Override
    public Position load(Long id) {
        
        PositionEntity positionEntity = positionRepository.findById(id)
                                     .orElseThrow(RuntimeException::new);

        return positionMapper.toDto(positionEntity);
    }

    @Override
    public void save(Position position) {
      
        PositionEntity positionEntity = positionMapper.toEntity(position);
        
        positionRepository.save(positionEntity);
    }

    @Override
    public void update(Position position) {

        PositionEntity positionEntity = positionMapper.toEntity(position);
        
        positionRepository.save(positionEntity);
        
    }

    @Override
    public List<Position> fetchAll() {

        List<PositionEntity> positionList = positionRepository.findAll();

        return positionMapper.toDto(positionList);
    }

    @Override
    public Position fetchById(Long id) {

        PositionEntity position = positionRepository.findById(id).orElseThrow(RuntimeException::new);

        return  positionMapper.toDto(position);
    }
}
