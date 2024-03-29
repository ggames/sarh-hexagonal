package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateCharacterPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.CharacterPositionEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.CharacterPositionMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class CharacterPositionPersistenceAdapter implements ILoadCharacterPositionPort, 
ISaveCharacterPositionPort, IUpdateCharacterPositionPort, IRetrieveCharacterPositionPort {

    private final CharacterPositionRepository characterRepository;

    private final CharacterPositionMapper characterPositionMapper;

    public CharacterPositionPersistenceAdapter(CharacterPositionRepository cPositionRepository, CharacterPositionMapper mapper){
        this.characterRepository = cPositionRepository;
        this.characterPositionMapper = mapper;
    }

    @Override
    public CharacterPosition load(Long id) {
        
        CharacterPositionEntity characterPosition = characterRepository.findById(id).orElseThrow(RuntimeException::new);

        return  characterPositionMapper.toDto(characterPosition);
    }

    @Override
    public void save(CharacterPosition characterPosition) {
         
        CharacterPositionEntity characterP = characterPositionMapper.toEntity(characterPosition);

        characterRepository.save(characterP);
        
    }

    @Override
    public void update(CharacterPosition characterPosition) {
       
        CharacterPositionEntity characterP = characterPositionMapper.toEntity(characterPosition);
        
        characterRepository.save(characterP);
    }

    @Override
    public List<CharacterPosition> getAll() {

        List<CharacterPositionEntity> charactersList = characterRepository.findAll();

        return characterPositionMapper.toDto(charactersList);
    }

    @Override
    public CharacterPosition fetchById(Long id) {
       CharacterPositionEntity characterPosition = characterRepository.findById(id).orElseThrow(RuntimeException::new) ;

       return characterPositionMapper.toDto(characterPosition);
    }
}
