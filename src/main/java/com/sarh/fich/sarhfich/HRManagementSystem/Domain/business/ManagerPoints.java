package com.sarh.fich.sarhfich.HRManagementSystem.Domain.business;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ManagerPoints {

    private final IUpdatePointPort updatePoint;

    public ManagerPoints(IUpdatePointPort updatePoint) {
        this.updatePoint = updatePoint;
    }

    public void resetPoints(Point point) throws BusinessException {

        List<ParentPoint> parentPointsList = point.getItemsPoint();

        if(parentPointsList.isEmpty()){
            throw new BusinessException("P-400", HttpStatus.NOT_FOUND, "No hay puntos asociados al actual");
        }

        parentPointsList.forEach(originPoints ->{
            Point originPoint = originPoints.getParentPoint();
            int pointsRecoveredFronOrigin = originPoint.getMissingQuantity() + originPoint.getQuantityAvailable();
            originPoint.setQuantityAvailable(pointsRecoveredFronOrigin);
            updatePoint.update(originPoint);
        });
        point.setItemsPoint(null);
        point.setQuantityAvailable(0);
        updatePoint.update(point);
    }
}
