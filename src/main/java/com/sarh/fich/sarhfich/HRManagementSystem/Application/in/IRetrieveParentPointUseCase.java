package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;

import java.util.List;

public interface IRetrieveParentPointUseCase {

    List<ParentPoint> getAllParentPoint();

    ParentPoint getParentPointById(Long id);
}
