package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "PUNTOS")
public class PointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "codigo_punto")
    private Long pointCode;
    
    @ManyToOne
    @Column(name = "tipo_cargo_id")
    private TypeOfPostEntity typeOfPost;

    @Column(name = "cantidad_disponibles")
    private Integer quantityAvailable;

    @Column(name = "cantidad_faltantes", nullable = true)
    private Integer missingQuantity ;
    
    @OneToMany(mappedBy = "poimt", cascade = CascadeType.ALL)
    private List<ItemPointEntity> itemsPoint;

    @Column(name = "transitorio")
    private boolean isTransient;
   
    @Column(columnDefinition = "boolean default false", name = "de_rectorado")
    private boolean rectorate;

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
