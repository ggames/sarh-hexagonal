package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdatePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.PostPlantCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadPostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdatePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdatePostPlantUseCase implements IUpdatePostPlantUseCase {

    private final ILoadPostPlantPort loadPostPlant;

    private final IUpdatePostPlantPort updatePostPlant;

    public UpdatePostPlantUseCase(ILoadPostPlantPort loadPostPlant,
            IUpdatePostPlantPort updatePostPlant) {

        this.loadPostPlant = loadPostPlant;
        this.updatePostPlant = updatePostPlant;

    }

    @Override
    public boolean updatePostPlant(Long id, PostPlantCommand command) {

        PostPlant postPlant = loadPostPlant.load(id);

        postPlant.setAgent(command.getAgent());
        postPlant.setOrganizationalSubunit(command.getOrganizationalSubunit());
        postPlant.setPosition(command.getPosition());
        postPlant.setMovementDate(command.getMovementDate());
        postPlant.setMovementMotive(command.getMovementMotive());
        postPlant.setStartDate(command.getStartDate());
        postPlant.setStartResolution(command.getStartResolution());
        postPlant.setTerminationDate(command.getTerminationDate());

        updatePostPlant.update(postPlant);

        return true;
    }

}
