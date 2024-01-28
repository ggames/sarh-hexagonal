package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.DocumentTypeCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class CreateDocumentTypeUseCase implements ICreateDocumentTypeUseCase {

    private final ISaveDocumentTypePort saveDocumentTypePort;

    public CreateDocumentTypeUseCase(ISaveDocumentTypePort saveDocumentTypePort){
        this.saveDocumentTypePort = saveDocumentTypePort;
    }


    @Override
    public boolean saveDocumentType(DocumentTypeCommand command) {
       
        DocumentType documentType = DocumentType.builder()
                                   .type(command.getType()).build();

        saveDocumentTypePort.save(documentType);                           

        return true;
    }
}
