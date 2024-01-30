package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateDocumentTypeUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.DocumentTypeCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/documenttype")
public class DocumentTypeController {

    private final IRetrieveDocumentTypeUseCase retrieveDocumentType;
    private final ICreateDocumentTypeUseCase saveDocumentType;

    private final IUpdateDocumentTypeUseCase updateDocumentType;

    public DocumentTypeController(IRetrieveDocumentTypeUseCase retrieveDocumentType,
                                  ICreateDocumentTypeUseCase saveDocumentType,
                                  IUpdateDocumentTypeUseCase updateDocumentType) {
        this.retrieveDocumentType = retrieveDocumentType;
        this.saveDocumentType = saveDocumentType;
        this.updateDocumentType = updateDocumentType;
    }

    @GetMapping(path = "documents", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DocumentType>> getAllDocumentType(){

        return ResponseEntity.ok(retrieveDocumentType.getAllDocumentType());

    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody DocumentType documentType){

        DocumentTypeCommand command = DocumentTypeCommand.builder()
                .type(documentType.getType())
                .build();

        saveDocumentType.saveDocumentType(command);
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(Long id, DocumentType documentType){
        DocumentTypeCommand command = DocumentTypeCommand.builder()
                               .type(documentType.getType()).build();

        updateDocumentType.updateDocumentType(id, command);
    }
}
