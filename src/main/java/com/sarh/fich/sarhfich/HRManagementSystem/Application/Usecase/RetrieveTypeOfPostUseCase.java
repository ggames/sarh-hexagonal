package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@UseCase
public class RetrieveTypeOfPostUseCase implements IRetrieveTypeOfPostUseCase {

    private final IRetrieveTypeOfPostPort retrieveTypeOfPost;

    public RetrieveTypeOfPostUseCase(IRetrieveTypeOfPostPort retrieveTypeOfPost) {
        this.retrieveTypeOfPost = retrieveTypeOfPost;
    }


    @Override
    public List<TypeOfPost> getAllTypeOfPost() {

        return retrieveTypeOfPost.fetchAll();
    }

    @Override
    public TypeOfPost getTypeOfPostById(Long id) {

        return retrieveTypeOfPost.fetchById(id);
    }
}
