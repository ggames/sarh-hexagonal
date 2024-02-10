package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.Date;
import java.util.List;


//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
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
    @JoinColumn(name = "tipo_cargo_id")
    private TypeOfPostEntity typeOfPost;

    @Column(name = "cantidad_disponibles")
    private Integer quantityAvailable;

    @Column(name = "cantidad_faltantes", nullable = true)
    private Integer missingQuantity ;
    
    
    /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_id", referencedColumnName = "id")
    private PointEntity childPoint;

    @OneToMany(mappedBy = "childPoint")
    private List<PointEntity> pointParents; */ 
    
    @OneToMany(mappedBy = "parentPoint")
    private List<ParentPointEntity> itemsPoint;

    @Column(name = "transitorio")
    private boolean isTemporary;
   
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
