package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.DocumentTypeEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;

import java.util.List;

@UseCase
public class RetrieveDocumentTypeUseCase implements IRetrieveDocumentTypeUseCase {

    private final IRetrieveDocumentTypePort retrieveDocumentType;

    public RetrieveDocumentTypeUseCase(IRetrieveDocumentTypePort retrieveDocumentType) {
        this.retrieveDocumentType = retrieveDocumentType;
    }


    @Override
    public List<DocumentType> getAllDocumentType() {

        List<DocumentType> documentType = retrieveDocumentType.getAll();

        return documentType;
    }
}
