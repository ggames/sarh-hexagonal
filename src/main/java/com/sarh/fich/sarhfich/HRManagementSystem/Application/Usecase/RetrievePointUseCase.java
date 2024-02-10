package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrievePointUseCase implements IRetrievePointUseCase {

    private final IRetrievePointPort retrievePoint;

    public RetrievePointUseCase(IRetrievePointPort retrievePoint) {
        this.retrievePoint = retrievePoint;
    }

    @Override
    public List<Point> getAllPoint() {
        return retrievePoint.fetchAll();
    }

    @Override
    public Point getPointById(Long id) {

        return retrievePoint.fetchById(id);
    }
}
