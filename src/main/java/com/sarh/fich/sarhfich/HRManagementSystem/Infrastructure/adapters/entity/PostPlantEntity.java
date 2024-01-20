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
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PLANTA_CARGOS")
public class PostPlantEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private PositionEntity position;

    @ManyToOne
    @JoinColumn(name = "agente_id")
    private AgentEntity agent;

    @ManyToOne
    @JoinColumn(name = "subunidad_organizativa_id")
    private OrganizationalSubunitEntity organizationalSubunit;

    @Column(name = "fecha_movimiento")
    private Date movementDate;

    @Column(name = "motivo_movimiento")
    private String movementMotive;

    @Column(name = "fecha_inicio")
    private Date startDate;

    @Column(name = "resolucion_inicio")
    private String startResolution;

    @Column(name = "fecha_fin")
    private Date terminationDate;

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
