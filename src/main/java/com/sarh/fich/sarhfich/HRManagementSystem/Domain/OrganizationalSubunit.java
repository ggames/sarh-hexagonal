package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationalSubunit {

    private Long id;

    private String guaraniCode;

    private String nameSubunit;

    private OrganizationalUnit organizationalUnit;

}
