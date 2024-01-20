package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import java.util.Date;


import com.sarh.fich.sarhfich.HRManagementSystem.Domain.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentCommand {
    
    private String name;
    private String lastname;
    private DocumentType documentType;
    private String document;
    private Date birthDate;
    private String docket;
    private String email;
    private String phone;
    private String address;

    
} 