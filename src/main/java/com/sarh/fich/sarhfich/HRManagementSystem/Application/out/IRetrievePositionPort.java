package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;

import java.util.List;

public interface IRetrievePositionPort {
    List<Position> fetchAll();
    Position fetchById(Long id);
}
