package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TransformationCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateTransformationUseCase implements IUpdateTransformationUseCase {

    private final ILoadTransformationPort loadTransformation;
    private final IUpdateTransformationPort updateTransformation;

    public UpdateTransformationUseCase(ILoadTransformationPort load, IUpdateTransformationPort update) {

        this.loadTransformation = load;
        this.updateTransformation = update;
    }

    @Override
    public boolean updateTransformation(Long id, TransformationCommand command) {

        Transformation transformation = loadTransformation.load(id);

        transformation.setResolutionNumber(command.getResolutionNumber());

        transformation.setTransformationResult(command.getTransformationResult());

        updateTransformation.update(transformation);

        return true;
    }

}
