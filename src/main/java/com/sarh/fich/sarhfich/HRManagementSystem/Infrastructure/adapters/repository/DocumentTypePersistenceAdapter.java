package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ILoadDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IRetrieveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.ISaveDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.out.IUpdateDocumentTypePort;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.DocumentType;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.DocumentTypeEntity;
import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.mapper.DocumentTypeMapper;
import com.sarh.fich.sarhfich.HRManagementSystem.common.PersistenceAdapter;

import java.util.List;

@PersistenceAdapter
public class DocumentTypePersistenceAdapter implements ILoadDocumentTypePort,
ISaveDocumentTypePort, IUpdateDocumentTypePort, IRetrieveDocumentTypePort {

    private final DocumentTypeRepository documentRepository;

    private final DocumentTypeMapper documentMapper;

    public DocumentTypePersistenceAdapter(DocumentTypeRepository documentRepository,
       DocumentTypeMapper documentMapper){
          this.documentRepository = documentRepository;
          this.documentMapper = documentMapper;
       }

    @Override
    public DocumentType load(Long id) {
      
        DocumentTypeEntity documentType = documentRepository.findById(id) 
         .orElseThrow(RuntimeException::new);

        return documentMapper.toDto(documentType);
    }

    @Override
    public void save(DocumentType documentType) {
       
        DocumentTypeEntity documentTypeEntity = documentMapper.toEntity(documentType);

        documentRepository.save(documentTypeEntity);
    }

    @Override
    public void update(DocumentType documentType) {
       
        DocumentTypeEntity documentTypeEntity = documentMapper.toEntity(documentType);

        documentRepository.save(documentTypeEntity);
    }

    @Override
    public List<DocumentType> getAll() {

        List<DocumentTypeEntity> documentTypeList = documentRepository.findAll();
        return documentMapper.toDto(documentTypeList);
    }

    @Override
    public DocumentType fetchById(Long id) {
        DocumentTypeEntity documentType = documentRepository.findById(id)
                .orElse(null);

        return documentMapper.toDto(documentType);
    }


}
