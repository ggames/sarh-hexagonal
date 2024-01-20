package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SUBUNIDADES_ORGANIZATIVAS")
public class OrganizationalSubunitEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String subUnit;

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
