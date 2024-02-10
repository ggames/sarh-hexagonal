package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;

import java.util.List;

public interface IRetrievePositionUseCase {

    List<Position> getAllPosition();

    Position getPositionById(Long id);
}
