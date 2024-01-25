package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;

public interface ILoadDocumentTypePort {
    
    DocumentType load(Long id);
}
