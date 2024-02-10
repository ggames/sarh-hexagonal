package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transformation {

    private Long id;

    @NotBlank(message = "Numero de Resolución Invalido: El numero de Resolución esta vacio")
    private String resolutionNumber;

    @NotBlank(message = "Resultado de Transformación Invalido: El Resultado de transformación esta vacio")
    private String transformationResult;

    private List<Position> createPosition;

    private List<Position> suppressionPosition;
}
