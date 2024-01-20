package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "AGENTES")
public class AgentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String name;

    @Column(name = "apellido", length = 45, nullable = false)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "tipo_doc_id", nullable = false)
    private DocumentTypeEntity documentType;
    
    @Column(nullable = false)
    private String document;

    @Column(name = "fecha_nac")
    private Date birthDate;

    @Column(name = "legajo")
    private String docket;

    @Column(name = "email", length = 150, nullable = false)
    private String email;

    @Column(length = 13)
    private String phone;

    @Column(length = 45)
    private String address;
    
    
    private Date createdAt;
   
    private Date updatedAt;


    @PrePersist
    protected void prePersist(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void preUpdate(){
        this.updatedAt = new Date();
    }
}
