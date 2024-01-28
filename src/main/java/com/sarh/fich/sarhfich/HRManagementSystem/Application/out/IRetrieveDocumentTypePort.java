package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;

import java.util.List;

public interface IRetrieveDocumentTypePort {

    List<DocumentType> getAll();
}
