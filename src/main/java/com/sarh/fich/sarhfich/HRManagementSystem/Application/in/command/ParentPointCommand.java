package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParentPointCommand {

    private Long childPoint;

    private Point parentPoint;

    private Integer occupiedQuantity;

  
}
