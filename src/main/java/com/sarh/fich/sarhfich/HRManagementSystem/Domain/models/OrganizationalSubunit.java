package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationalSubunit {

    private Long id;

    private String guaraniCode;

    private String nameSubunit;

    private OrganizationalUnit organizationalUnit;

}
