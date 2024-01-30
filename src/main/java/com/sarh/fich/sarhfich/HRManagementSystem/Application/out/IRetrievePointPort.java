package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

import java.util.List;

public interface IRetrievePointPort {

    List<Point> fetchAll();
    Point fetchById(Long id);
}
