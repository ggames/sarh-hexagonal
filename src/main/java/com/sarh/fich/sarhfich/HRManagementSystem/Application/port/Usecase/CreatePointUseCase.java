package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISavePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreatePointUseCase implements ICreatePointUseCase{

    private final ISavePointPort savePointPort;

    public CreatePointUseCase(ISavePointPort savePointPort){

        this.savePointPort = savePointPort;
    }


    @Override
    public boolean savePoint(PointCommand command) {
        
        Point point = Point.builder()
                           .pointCode(command.getPointCode())
                           .typeOfPost(command.getTypeOfPost())
                           .quantityAvailable(command.getQuantityAvailable())
                           .missingQuantity(command.getMissingQuantity())
                           .isTemporary(command.isTemporary())
                           .rectorate(command.isRectorate())
                           .build();
        
        savePointPort.save(point);                   

        return true;
    }
    
}
