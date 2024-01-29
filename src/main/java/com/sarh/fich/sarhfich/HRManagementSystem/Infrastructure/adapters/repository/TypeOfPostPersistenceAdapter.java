package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.TypeOfPostEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.TypeOfPostMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class TypeOfPostPersistenceAdapter implements ILoadTypeOfPostPort,
        ISaveTypeOfPostPort, IUpdateTypeOfPostPort, IRetrieveTypeOfPostPort {

    private final TypeOfPostRepository typePostRepository;

    private final TypeOfPostMapper typePostMapper;



    public TypeOfPostPersistenceAdapter(TypeOfPostRepository typePostRepository,
            TypeOfPostMapper typePostMapper) {
        this.typePostRepository = typePostRepository;
        this.typePostMapper = typePostMapper;
    }

    @Override
    public TypeOfPost load(Long id) {

        TypeOfPostEntity typeOfPostEntity = typePostRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return typePostMapper.toDto(typeOfPostEntity);
    }

    @Override
    public void save(TypeOfPost typeOfPost) {
        TypeOfPostEntity typeOfPostEntity = typePostMapper.toEntity(typeOfPost);

        typePostRepository.save(typeOfPostEntity);
    }

    @Override
    public void update(TypeOfPost typeOfPost) {

        TypeOfPostEntity typeOfPostEntity = typePostMapper.toEntity(typeOfPost);

        typePostRepository.save(typeOfPostEntity);
    }

    @Override
    public List<TypeOfPost> fetchAll() {

        List<TypeOfPostEntity> typeOfPostList = typePostRepository.findAll();

        return typePostMapper.toDto(typeOfPostList);
    }

    @Override
    public TypeOfPost fetchById(Long id) {

        TypeOfPostEntity typeOfPost = typePostRepository.findById(id).orElseThrow(RuntimeException::new);

        return typePostMapper.toDto(typeOfPost);
    }
}
