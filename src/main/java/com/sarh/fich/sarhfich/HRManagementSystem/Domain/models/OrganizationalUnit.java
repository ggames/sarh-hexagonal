package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationalUnit {
    
    private Long id;

    private String nameUnit;

    private int directorId;

    private int vicePrincipalId;

    private List<OrganizationalSubunit> subUnits;

    private List<Position> positions;

}
