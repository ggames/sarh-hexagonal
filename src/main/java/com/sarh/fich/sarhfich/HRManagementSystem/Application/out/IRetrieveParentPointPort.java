package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;

import java.util.List;

public interface IRetrieveParentPointPort {

    List<ParentPoint> fetchAll();
    ParentPoint fetchById(Long id);
}
