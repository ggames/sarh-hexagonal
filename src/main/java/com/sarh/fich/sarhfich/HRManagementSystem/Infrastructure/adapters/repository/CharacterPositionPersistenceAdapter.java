package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadCbaracterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.CharacterPositionEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.CharacterPositionMapper;

public class CharacterPositionPersistenceAdapter implements ILoadCbaracterPositionPort, 
ISaveCharacterPositionPort, IUpdateCharacterPositionPort {

    private final CharacterPositionRepository characterRepository;

    private final CharacterPositionMapper mapper;

    public CharacterPositionPersistenceAdapter(CharacterPositionRepository cPositionRepository, CharacterPositionMapper mapper){
        this.characterRepository = cPositionRepository;
        this.mapper = mapper;
    }

    @Override
    public CharacterPosition load(Long id) {
        
        CharacterPositionEntity characterPosition = characterRepository.findById(id).orElseThrow(RuntimeException::new);

        return mapper.toDto(characterPosition);
    }

    @Override
    public void save(CharacterPosition characterPosition) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateCharecterPosition(CharacterPosition characterPosition) {
        // TODO Auto-generated method stub
        
    }
    
}
