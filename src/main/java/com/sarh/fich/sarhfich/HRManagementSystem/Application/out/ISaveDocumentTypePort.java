package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;

public interface ISaveDocumentTypePort {
    
    void save(DocumentType documentType);
}
