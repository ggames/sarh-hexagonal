package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadPointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdatePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

public class UpdatePointUseCase implements IUpdatePointUseCase {

    private final ILoadPointPort loadPointPort;

    private final IUpdatePointPort updatePointPort;


    public UpdatePointUseCase(ILoadPointPort loadPointPort, IUpdatePointPort updatePointPort){

        this.loadPointPort = loadPointPort;
        this.updatePointPort = updatePointPort;
    }

    @Override
    public boolean updatePoint(Long id, PointCommand command) {
        
        Point point = loadPointPort.load(id);

        point.setPointCode(command.getPointCode());
        point.setTypeOfPost(command.getTypeOfPost());
        point.setQuantityAvailable(command.getQuantityAvailable());
        point.setMissingQuantity(command.getMissingQuantity());
        point.setTemporary(command.isTemporary());
        point.setRectorate(command.isRectorate());

        updatePointPort.update(point);

        return true;
    }
    
}