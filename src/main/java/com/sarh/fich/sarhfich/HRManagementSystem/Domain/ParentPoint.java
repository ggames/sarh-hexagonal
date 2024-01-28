package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

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

    private Long parentPoint;

    private Point childPoint;

    private Integer occupiedQuantity;
}
