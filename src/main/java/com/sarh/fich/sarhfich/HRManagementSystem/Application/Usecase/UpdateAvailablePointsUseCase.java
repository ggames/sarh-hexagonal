package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateAvailablePointsUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.common.CalculatePoints;

import java.util.List;

public class UpdateAvailablePointsUseCase implements IUpdateAvailablePointsUseCase {

    private final IRetrievePointPort retrievePoint;

    private final IRetrieveTypeOfPostPort retrieveTypeOfPost;
    private final CalculatePoints calculatePoints;

    public UpdateAvailablePointsUseCase(IRetrievePointPort retrievePoint, IRetrieveTypeOfPostPort retrieveTypeOfPost, CalculatePoints calculatePoints) {
        this.retrievePoint = retrievePoint;
        this.retrieveTypeOfPost = retrieveTypeOfPost;
        this.calculatePoints = calculatePoints;
    }


    @Override
    public boolean updateAvialablePoint(Long pointTypeCode, int pointsQuantity) {

        List<Point> pointList = retrievePoint.fetchAll();
        TypeOfPost typePoint = retrieveTypeOfPost.fetchById(pointTypeCode);
        pointList.stream().filter( point -> point.getPointCode() == pointTypeCode).map(
            pointtype ->      calculatePoints.CalculatePointsByParity(pointtype
                                             .getQuantityAvailable(),
                                             typePoint.getAmountOfPostPoint(),
                                             pointsQuantity)
        );

        return false;
    }
}
