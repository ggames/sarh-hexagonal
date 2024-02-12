package com.sarh.fich.sarhfich.HRManagementSystem.Domain.business;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IDeleteParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import org.springframework.http.HttpStatus;

import java.util.List;

public class PointOriginManager {

    private final IDeleteParentPointPort deleteParentPoint;

    public PointOriginManager(IDeleteParentPointPort deleteParentPoint) {
        this.deleteParentPoint = deleteParentPoint;
    }

    public boolean deleteOriginPointsFromPoint(Point point)throws BusinessException {
        List<ParentPoint> parentpointsList = point.getItemsPoint();
        if(parentpointsList.isEmpty()){
            throw new BusinessException("P-400", HttpStatus.NOT_FOUND, "No hay puntos de origen asociados al punto");
        }
       if(!point.isTemporary()){
           throw new BusinessException("P-400", HttpStatus.NOT_FOUND, "No es un punto transitorio");
       }
        parentpointsList.forEach(parentPoint -> {
            deleteParentPoint.delete(parentPoint.getId());
        });

        return true;
    }
}
