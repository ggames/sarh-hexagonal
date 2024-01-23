package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
