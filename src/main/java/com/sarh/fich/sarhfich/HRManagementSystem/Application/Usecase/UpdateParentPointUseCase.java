package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateParentPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateParentPointUseCase implements IUpdateParentPointUseCase {

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
            parentPoint.setChildPoint(command.getChildPoint());
            parentPoint.setOccupiedQuantity(command.getOccupiedQuantity());

            updateParentPoint.update(parentPoint);

       return true;  
    }
    
}
