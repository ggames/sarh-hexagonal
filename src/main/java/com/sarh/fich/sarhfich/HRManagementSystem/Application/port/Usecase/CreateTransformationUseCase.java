package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;



import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.ICreateTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.TransformationCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ISaveTransformationPort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;


@UseCase
public class CreateTransformationUseCase implements ICreateTransformationUseCase {

    private ISaveTransformationPort saveTransformationPort; 


    public CreateTransformationUseCase(ISaveTransformationPort saveTransformationPort){
          this.saveTransformationPort = saveTransformationPort;
    }

    @Override
    public boolean createTransformation(TransformationCommand command) {
        
        Transformation tranformation = Transformation.builder()
                              .resolutionNumber(command.getResolutionNumber())
                              .transformationResult(command.getTransformationResult()) 
                              .build();
                saveTransformationPort.save(tranformation);              

        return true;
    }
    
}
