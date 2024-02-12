package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

public interface IUpdateAvailablePointsUseCase {

    boolean updateAvialablePoint(Long pointTypeCode,int pointsQuantity);

    boolean updateAvailablePointToCreatePoint(Long id, Integer occupiedPoints);

    boolean updateAvailablePointPerAssembly(Long id, Integer quantityPoints);
}
