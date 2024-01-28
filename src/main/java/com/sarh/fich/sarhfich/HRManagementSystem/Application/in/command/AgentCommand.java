package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import java.util.Date;


import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentCommand {
    private String firstName;
    private String lastName;
    private DocumentType documentType;
    private String document;
    private Date birthDate;
    private String docket;
    private String email;
    private String phone;
    private String address;

    
}