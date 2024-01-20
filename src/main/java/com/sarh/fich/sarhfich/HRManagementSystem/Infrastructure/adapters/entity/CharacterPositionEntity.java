package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.Date;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.CharacterPositionEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "CARACTERES_CARGOS")
public class CharacterPositionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(name = "caracter_cargo")
    private CharacterPositionEnum characterPosition;

    @Column(name = "nombre")
    private String name;

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
