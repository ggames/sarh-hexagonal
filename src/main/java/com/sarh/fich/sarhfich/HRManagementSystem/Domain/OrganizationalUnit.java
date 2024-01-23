package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganizationalUnit {
    
    private Long id;

    private String nameUnit;

    private int directorId;

    private int vicePrincipalId;
    
}
