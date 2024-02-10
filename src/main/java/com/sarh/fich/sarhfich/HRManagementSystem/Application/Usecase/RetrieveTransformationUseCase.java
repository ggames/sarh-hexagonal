package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrieveTransformationUseCase implements IRetrieveTransformationUseCase {

    private final IRetrieveTransformationPort retrieveTransformation;

    public RetrieveTransformationUseCase(IRetrieveTransformationPort retrieveTransformation) {
        this.retrieveTransformation = retrieveTransformation;
    }


    @Override
    public List<Transformation> getAllTransformation() {

        return retrieveTransformation.fetchAll();
    }

    @Override
    public Transformation getTransformationById(Long id) {

        return retrieveTransformation.fetchById(id);
    }
}
