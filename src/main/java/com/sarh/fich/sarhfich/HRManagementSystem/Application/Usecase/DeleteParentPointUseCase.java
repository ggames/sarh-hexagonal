package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IDeleteParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IDeleteParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class DeleteParentPointUseCase implements IDeleteParentPointUseCase {

    private final IDeleteParentPointPort deleteParentPoint;

    public DeleteParentPointUseCase(IDeleteParentPointPort deleteParentPoint) {
        this.deleteParentPoint = deleteParentPoint;
    }

    @Override
    public void deleteParentPoint(ParentPointCommand command) {

        deleteParentPoint.delete(command.getId());
    }
}
