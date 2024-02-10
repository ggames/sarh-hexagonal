package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePositionPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdatePositionUseCase implements IUpdatePositionUseCase {

    private final ILoadPositionPort loadPosition;

    private final IUpdatePositionPort updatePosition;

    public UpdatePositionUseCase(ILoadPositionPort loadPosition, IUpdatePositionPort updatePosition ){

        this.loadPosition = loadPosition;
        this.updatePosition = updatePosition;
    }
    
    @Override
    public boolean updatePosition(Long id, PositionCommand command) {
        
        Position position = loadPosition.load(id);

        position.setPostCode(command.getPostCode());
        position.setCharacterPosition(command.getCharacterPosition());
        position.setOrganizationalUnit(command.getOrganizationalUnit());
        position.setPostStatus(command.getPostStatus());
        position.setPoint(command.getPoint());
        position.setCreationTransformation(command.getCreationTransformation());
        position.setSuppressionTransformation(command.getSuppressionTransformation());

        updatePosition.update(position);
       
        return true;

    }
    
}
