package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.IUpdateDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.DocumentTypeCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.ILoadDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out.IUpdateDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateDocumentTypeUseCase implements IUpdateDocumentTypeUseCase{

    private final ILoadDocumentTypePort loadDocumentTypePort;

    private final IUpdateDocumentTypePort updateDocumentTypePort;

    public UpdateDocumentTypeUseCase(ILoadDocumentTypePort loadDocumentTypePort,
     IUpdateDocumentTypePort updateDocumentTypePort ){
        this.loadDocumentTypePort = loadDocumentTypePort;
        this.updateDocumentTypePort = updateDocumentTypePort;
     }

    @Override
    public boolean updateDocumentType(Long id, DocumentTypeCommand command) {
        DocumentType documentType = loadDocumentTypePort.load(id);

        documentType.setType(command.getType());

        updateDocumentTypePort.update(documentType);

        return true;
    }
    
}
