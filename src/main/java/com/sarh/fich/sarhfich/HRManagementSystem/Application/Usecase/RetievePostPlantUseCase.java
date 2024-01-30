package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;

import java.util.List;

public class RetievePostPlantUseCase implements IRetrievePostPlantUseCase {

    private final IRetrievePostPlantPort retrievePostPlant;

    public RetievePostPlantUseCase(IRetrievePostPlantPort retrievePostPlant) {
        this.retrievePostPlant = retrievePostPlant;
    }

    @Override
    public List<PostPlant> getAllPostPlant() {

        return retrievePostPlant.fetchAll();
    }

    @Override
    public PostPlant getPostPlantById(Long id) {

        return retrievePostPlant.fetchById(id);
    }
}
