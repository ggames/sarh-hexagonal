package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParentPoint {
    
    private Long id;

    private Long childPoint;

    private Point parentPoint;

    private Integer occupiedQuantity;
}
