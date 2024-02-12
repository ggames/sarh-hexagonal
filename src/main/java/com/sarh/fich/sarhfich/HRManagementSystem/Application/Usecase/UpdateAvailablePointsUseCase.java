package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateAvailablePointsUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveTypeOfPostPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.common.CalculatePoints;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class UpdateAvailablePointsUseCase implements IUpdateAvailablePointsUseCase {

    private final ILoadPointPort loadPointPort;

    private final IUpdatePointPort updatePointPort;
    private final IRetrievePointPort retrievePoint;

    private final IRetrieveTypeOfPostPort retrieveTypeOfPost;
    private final CalculatePoints calculatePoints;

    public UpdateAvailablePointsUseCase(ILoadPointPort loadPointPort,
                                        IUpdatePointPort updatePointPort,
                                        IRetrievePointPort retrievePoint,
                                        IRetrieveTypeOfPostPort retrieveTypeOfPost,
                                        CalculatePoints calculatePoints) {
        this.loadPointPort = loadPointPort;
        this.updatePointPort = updatePointPort;
        this.retrievePoint = retrievePoint;
        this.retrieveTypeOfPost = retrieveTypeOfPost;
        this.calculatePoints = calculatePoints;
    }


    @Override
    public boolean updateAvialablePoint(Long pointTypeCode, int pointsQuantity) {

        List<Point> pointList = retrievePoint.fetchAll();
        TypeOfPost typePoint = retrieveTypeOfPost.fetchById(pointTypeCode);
        pointList.stream().filter( point -> point.getPointCode().equals(pointTypeCode)).map(
            pointtype ->      calculatePoints.CalculatePointsByParity(pointtype
                                             .getQuantityAvailable(),
                                             typePoint.getAmountOfPostPoint(),
                                             pointsQuantity)
        );

        return false;
    }


    @Override
    public boolean updateAvailablePointToCreatePoint(Long id, Integer occupiedPoints) {

        Point point = loadPointPort.load(id);

        point.subtract(occupiedPoints);

        updatePointPort.update(point);

        return true;
    }

    @Override
    public boolean updateAvailablePointPerAssembly(Long id, Integer quantityPoints) {

        Point point = loadPointPort.load(id);

        point.setQuantityAvailable(quantityPoints);

        updatePointPort.update(point);

        return true;
    }


}
