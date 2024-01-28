package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;

public class CreateParentPointUseCase implements ICreateParentPointUseCase {
    
    private final ISaveParentPointPort saveParentPoint;

    public CreateParentPointUseCase(ISaveParentPointPort saveParentPoint){
        this.saveParentPoint = saveParentPoint;
    }

    @Override
    public boolean saveParentPoint(ParentPointCommand command) {
        
        ParentPoint parentPoint = ParentPoint.builder()
                              .parentPoint(command.getParenPoint())
                              .childPoint(command.getChildPoint())
                              .occupiedQuantity(command.getOccupiedQuantity())
                              .build();
        saveParentPoint.save(parentPoint);

        return true;
    }

    
}
