package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPointCommand {
    
    private Point point;

    private Integer quantityAvailable;
}
