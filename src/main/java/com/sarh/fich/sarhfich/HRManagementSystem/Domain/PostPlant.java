package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class PostPlant {
    
    private Long id;

    private Position position;
    
    private Agent agent;

    private OrganizationalSubunit organizationalSubunit;

    private Date movementDate;

    private String movementMotive;

    private Date startDate;

    private String startResolution;

    private Date terminationDate;

}
