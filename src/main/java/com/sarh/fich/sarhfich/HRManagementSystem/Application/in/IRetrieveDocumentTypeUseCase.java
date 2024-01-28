package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;

import java.util.List;

public interface IRetrieveDocumentTypeUseCase {

    List<DocumentType> getAllDocumentType();
}
