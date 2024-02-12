package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

public interface IDeleteOriginPointUseCase {

    boolean deleteOriginPoint(Point command);

}
