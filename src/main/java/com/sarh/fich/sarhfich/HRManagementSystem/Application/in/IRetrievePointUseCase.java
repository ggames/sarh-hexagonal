package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

import java.util.List;

public interface IRetrievePointUseCase {
    List<Point> getAllPoint();
    Point getPointById(Long id);

}
