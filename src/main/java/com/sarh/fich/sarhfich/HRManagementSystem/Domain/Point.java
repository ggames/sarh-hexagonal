package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Point {

    private Long id;

    private Long pointCode;

    private TypeOfPost typeOfPost;

    private Integer quantityAvailable;

    private Integer missingQuantity;

    private boolean isTransient;

    private boolean rectorate;

}
