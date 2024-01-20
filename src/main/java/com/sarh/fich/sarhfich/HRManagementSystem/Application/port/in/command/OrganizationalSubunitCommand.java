package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationalSubunitCommand {
 
    private String guaraniCode;

    private String nameSubunit;

    private OrganizationalUnit organizationalUnit;
}
