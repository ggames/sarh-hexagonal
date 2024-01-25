package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.DocumentTypeCommand;

public interface ICreateDocumentTypeUseCase {
    
    public boolean saveDocumentType(DocumentTypeCommand command);
}
