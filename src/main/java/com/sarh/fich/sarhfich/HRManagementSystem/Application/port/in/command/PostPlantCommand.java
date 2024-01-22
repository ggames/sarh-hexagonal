package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import java.util.Date;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalSubunit;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Position;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
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
