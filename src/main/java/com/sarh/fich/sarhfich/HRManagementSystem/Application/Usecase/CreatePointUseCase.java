package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePointPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@UseCase
public class CreatePointUseCase implements ICreatePointUseCase {

    private final ISavePointPort savePointPort;

    public CreatePointUseCase(ISavePointPort savePointPort){

        this.savePointPort = savePointPort;
    }


    @Transactional
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

        Point pointNew = savePointPort.save(point);


        if(command.getItemsPoint() != null ){
           List<ParentPoint> items = command.getItemsPoint();
           items.forEach(__point -> __point.setChildPoint(pointNew));
           point.setItemsPoint(items);
       }
        savePointPort.save(pointNew);

        return true;
    }
    
}
