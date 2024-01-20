package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "TIPOS_CARGOS")
public class TypeOfPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_cargo")
    private String namePost;

    @Column(name = "sueldo_basico")
    private Double minimumWage;

    @Column(name = "cantidad_puntos_cargo")
    private Integer amountOfPostPoint;

    @OneToMany(mappedBy = "typeOfPost", cascade = CascadeType.ALL)
    private List<PointEntity> points;

}
