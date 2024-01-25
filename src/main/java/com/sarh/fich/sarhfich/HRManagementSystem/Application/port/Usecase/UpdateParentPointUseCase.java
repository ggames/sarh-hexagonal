package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.ParentPoint;

public class UpdateParentPointUseCase implements IUpdateParentPointUseCase{

    private final IUpdateParentPointPort updateParentPoint;

    private final ILoadParentPointPort loadParentPoint;

    public UpdateParentPointUseCase(IUpdateParentPointPort updateParentPoint,
           ILoadParentPointPort loadParentPoint){

            this.updateParentPoint = updateParentPoint;
            this.loadParentPoint = loadParentPoint;
           }

    @Override
    public boolean updateParentPoint(Long id, ParentPointCommand command) {
        ParentPoint parentPoint = loadParentPoint.load(id);
            parentPoint.setParentPoint(command.getParenPoint());
            parentPoint.setPoint(command.getPoint());
            parentPoint.setOccupiedQuantity(command.getOccupiedQuantity());

            updateParentPoint.update(parentPoint);

       return true;
    }
    
}
