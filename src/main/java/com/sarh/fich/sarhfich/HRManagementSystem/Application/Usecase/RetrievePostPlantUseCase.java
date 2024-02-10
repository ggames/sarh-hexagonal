package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrievePostPlantUseCase implements IRetrievePostPlantUseCase {

    private final IRetrievePostPlantPort retrievePostPlant;

    public RetrievePostPlantUseCase(IRetrievePostPlantPort retrievePostPlant) {
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
