package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePostStatusPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrievePostStatusUseCase implements IRetrievePostStatusUseCase {

    private final IRetrievePostStatusPort retrievePostStatus;

    public RetrievePostStatusUseCase(IRetrievePostStatusPort retrievePostStatus) {
        this.retrievePostStatus = retrievePostStatus;
    }

    @Override
    public List<PostStatus> getAllPostStatus() {
        return retrievePostStatus.fetchAll();
    }

    @Override
    public PostStatus getPostStatusById(Long id) {
        return retrievePostStatus.fetchById(id);
    }
}
