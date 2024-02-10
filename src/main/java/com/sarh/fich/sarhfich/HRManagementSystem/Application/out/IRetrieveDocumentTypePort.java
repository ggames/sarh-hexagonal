package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;

import java.util.List;

public interface IRetrieveDocumentTypePort {

    List<DocumentType> getAll();

    DocumentType fetchById(Long id);


}
