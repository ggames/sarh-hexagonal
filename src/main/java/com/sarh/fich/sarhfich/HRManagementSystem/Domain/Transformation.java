package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transformation {

    private Long id;

    @NotBlank(message = "Numero de Resolución Invalido: El numero de Resolución esta vacio")
    private String resolutionNumber;

    @NotBlank(message = "Resultado de Transformación Invalido: El Resultado de transformación esta vacio")
    private String transformationResult;

    private List<Position> createPositions;

    private List<Position> suppressionPositions;
}
