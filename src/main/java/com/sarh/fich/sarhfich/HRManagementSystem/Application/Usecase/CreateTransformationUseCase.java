package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;



import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TransformationCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;


@UseCase
public class CreateTransformationUseCase implements ICreateTransformationUseCase {

    private ISaveTransformationPort saveTransformationPort; 


    public CreateTransformationUseCase(ISaveTransformationPort saveTransformationPort){
          this.saveTransformationPort = saveTransformationPort;
    }

    @Override
    public boolean saveTransformation(TransformationCommand command) {
        
        Transformation tranformation = Transformation.builder()
                              .resolutionNumber(command.getResolutionNumber())
                              .transformationResult(command.getTransformationResult()) 
                              .build();
                saveTransformationPort.save(tranformation);              

        return true;
    }
    
}
