package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrieveParentPointUseCase implements IRetrieveParentPointUseCase {

    private final IRetrieveParentPointPort retrieveParentPoint;

    public RetrieveParentPointUseCase(IRetrieveParentPointPort retrieveParentPoint) {
        this.retrieveParentPoint = retrieveParentPoint;
    }

    @Override
    public List<ParentPoint> getAllParentPoint() {

        return retrieveParentPoint.fetchAll();
    }

    @Override
    public ParentPoint getParentPointById(Long id) {

        return retrieveParentPoint.fetchById(id);
    }
}
