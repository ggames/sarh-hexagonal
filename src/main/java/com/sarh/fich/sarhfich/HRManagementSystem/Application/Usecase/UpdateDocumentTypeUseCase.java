package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.DocumentTypeCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

@UseCase
public class UpdateDocumentTypeUseCase implements IUpdateDocumentTypeUseCase {

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
