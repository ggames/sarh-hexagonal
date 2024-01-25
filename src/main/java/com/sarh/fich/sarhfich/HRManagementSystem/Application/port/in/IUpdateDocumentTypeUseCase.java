package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command.DocumentTypeCommand;

public interface IUpdateDocumentTypeUseCase {
    
    public boolean updateDocumentType(Long id, DocumentTypeCommand command);
}
