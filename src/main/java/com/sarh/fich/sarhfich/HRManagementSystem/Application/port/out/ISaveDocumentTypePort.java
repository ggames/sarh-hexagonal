package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;

public interface ISaveDocumentTypePort {
    
    void save(DocumentType documentType);
}