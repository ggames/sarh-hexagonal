package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IDeleteOriginPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.business.PointOriginManager;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

public class DeleteOriginPointUseCase implements IDeleteOriginPointUseCase {

    private final PointOriginManager pointOriginManager;

    public DeleteOriginPointUseCase(PointOriginManager pointOriginManager) {
        this.pointOriginManager = pointOriginManager;
    }

    @Override
    public boolean deleteOriginPoint(Point command) {

        pointOriginManager.deleteOriginPointsFromPoint(command);

        return true;
    }
}
