package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationalUnitCommand {

    private String nameUnit;

    private int director;
    
    private int vicePrincipal;

  }
