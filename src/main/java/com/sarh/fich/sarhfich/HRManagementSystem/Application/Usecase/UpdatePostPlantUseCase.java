package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostPlantCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdatePostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadPostPlantPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;
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
