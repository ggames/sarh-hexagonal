package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParentPointCommand {

    private Point parenPoint;
    
    private Point point;

    private Integer occupiedQuantity;

}
