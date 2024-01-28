package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.DocumentTypeCommand;

public interface ICreateDocumentTypeUseCase {
    
    public boolean saveDocumentType(DocumentTypeCommand command);
}
