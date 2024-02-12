package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.TypeOfPost;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PointCommand {
    
    private Long pointCode;

    private TypeOfPost typeOfPost;

    private Integer quantityAvailable;

    private Integer missingQuantity;

    private List<ParentPoint> itemsPoint;

    private boolean isTemporary;

    private boolean rectorate;


}
