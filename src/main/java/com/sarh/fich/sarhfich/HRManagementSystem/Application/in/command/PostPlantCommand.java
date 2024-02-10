package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import java.util.Date;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostPlantCommand {
    
    private Position position;
    
    private Agent agent;

    private OrganizationalSubunit organizationalSubunit;

    private Date movementDate;

    private String movementMotive;

    private Date startDate;

    private String startResolution;

    private Date terminationDate;

    
}
