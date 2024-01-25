package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointCommand {
    
    private Long pointCode;

    private TypeOfPost typeOfPost;

    private Integer quantityAvailable;

    private Integer missingQuantity;

    private boolean isTemporary;

    private boolean rectorate;

}
