package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.DocumentTypeCommand;

public interface IUpdateDocumentTypeUseCase {
    
    public boolean updateDocumentType(Long id, DocumentTypeCommand command);
}
