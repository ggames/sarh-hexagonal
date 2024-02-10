package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrievePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrievePositionUseCase implements IRetrievePositionUseCase {

    private final IRetrievePositionPort retrievePosition;

    public RetrievePositionUseCase(IRetrievePositionPort retrievePosition) {
        this.retrievePosition = retrievePosition;
    }

    @Override
    public List<Position> getAllPosition() {
        return retrievePosition.fetchAll();
    }

    @Override
    public Position getPositionById(Long id) {

        return retrievePosition.fetchById(id);
    }
}
