package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "CARGOS")
public class PositionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_cargo", unique = true)
    private Long postCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unidad_organizativa_id")
    private OrganizationalUnitEntity organizationalUnit;  
    
    @ManyToOne
    @JoinColumn(name = "punto_id")
    private PointEntity point;

    @ManyToOne
    @JoinColumn(name = "estado_cargo_id")
    private PostStatusEntity postStatus;
    
    @ManyToOne
    @JoinColumn(name = "caracter_cargo_id")
    private CharacterPositionEntity characterPosition;

    @ManyToOne
    @JoinColumn(name = "transformacion_creacion_id")
    private TransformationEntity creationTransformation;


    @ManyToOne
    @JoinColumn(name= "transformacion_supresion_id")
    private TransformationEntity suppressionTransformation;

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
