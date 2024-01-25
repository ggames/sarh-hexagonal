package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;

public class CreateParentPointUseCase implements ICreateParentPointUseCase{
    
    private final ISaveParentPointPort saveParentPoint;

    public CreateParentPointUseCase(ISaveParentPointPort saveParentPoint){
        this.saveParentPoint = saveParentPoint;
    }

    @Override
    public boolean saveParentPoint(ParentPointCommand command) {
        
        ParentPoint parentPoint = ParentPoint.builder()
                              .parentPoint(command.getParenPoint())
                              .point(command.getPoint())
                              .occupiedQuantity(command.getOccupiedQuantity())
                              .build();
        saveParentPoint.save(parentPoint);

        return true;
    }

    
}
