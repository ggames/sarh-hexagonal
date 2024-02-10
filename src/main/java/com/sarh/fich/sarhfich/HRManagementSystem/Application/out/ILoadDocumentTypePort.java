package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;

public interface ILoadDocumentTypePort {
    
    DocumentType load(Long id);
}
