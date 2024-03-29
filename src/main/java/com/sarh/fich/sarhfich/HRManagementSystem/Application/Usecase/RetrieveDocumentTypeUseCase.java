package com.sarh.fich.sarhfich.HRManagementSystem.Application.Usecase;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.common.UseCase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@UseCase

public class RetrieveDocumentTypeUseCase implements IRetrieveDocumentTypeUseCase {

    private final IRetrieveDocumentTypePort retrieveDocumentType;

    public RetrieveDocumentTypeUseCase(IRetrieveDocumentTypePort retrieveDocumentType) {
        this.retrieveDocumentType = retrieveDocumentType;
    }


    @Transactional(readOnly = true)
    @Override
    public List<DocumentType> getAllDocumentType() {

        List<DocumentType> documentType = retrieveDocumentType.getAll();

        return documentType;
    }

    @Override
    public DocumentType getDocumentTypeById(Long id) {

        return retrieveDocumentType.fetchById(id);
    }


}
