package com.sarh.fich.sarhfich.HRManagementSystem.Domain.business;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.validator.IGenericValidator;
import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DocumentTypeValidator implements IGenericValidator<DocumentType> {

    private final IRetrieveDocumentTypePort retrieveDocumentType;

    public DocumentTypeValidator(IRetrieveDocumentTypePort retrieveDocumentType) {
        this.retrieveDocumentType = retrieveDocumentType;
    }

    @Override
    public void validator(DocumentType object) throws BusinessException {
        if(retrieveDocumentType.fetchById(object.getId())==null){
            message("P-$01", HttpStatus.NOT_FOUND,"Tipo de documento no existe");
        }

    }


    private void message(String code, HttpStatus status, String message) throws BusinessException {
        throw new BusinessException(code, status, message);
    }
}
