package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;


import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISavePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreatePositionUseCase implements ICreatePositionUseCase {

    private ISavePositionPort savePosition;

    public CreatePositionUseCase(ISavePositionPort savePosition){
        this.savePosition = savePosition;
    }

    @Override
    public boolean savePosition(PositionCommand command) {
    
        Position position = Position.builder()
                  .postCode(command.getPostCode())
                  .characterPosition(command.getCharacterPosition())
                  .organizationalUnit(command.getOrganizationalUnit())
                  .point(command.getPoint())
                  .postStatus(command.getPostStatus())
                  .point(command.getPoint())
                  .creationTransformation(command.getCreationTransformation())
                  .suppressionTransformation(command.getSuppressionTransformation())
                  .build();

        savePosition.save(position); 

        return true;
    }

 
}
