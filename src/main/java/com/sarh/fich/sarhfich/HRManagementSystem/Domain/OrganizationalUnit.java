package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationalUnit {
    
    private Long id;

    private String nameUnit;

    private int director;

    private int vicePrincipal;
    
}
