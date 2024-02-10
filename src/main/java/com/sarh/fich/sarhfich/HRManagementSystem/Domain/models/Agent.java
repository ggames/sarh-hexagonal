package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor   
public class Agent {
    private Long id;

    private String firstname;
   
    private String lastname;
   

    private DocumentType documentType;
   
    private String document;
   
    private Date birthDate;

    private Date leavingDate;

    private boolean isDeceased;
   
    private String docket;
   
    private String email;
   
    private String phone;
   
    private String address;

    //private LocalDateTime dateCreated;
    //private LocalDateTime dateUpdated;

    
}
