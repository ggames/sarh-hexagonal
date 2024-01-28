package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
   
    @NotBlank(message = "Nombre Invalido: Nombre en blanco")
    @NotNull(message = "Nombre Invalido: El nombre es NULL")
    @Size(min = 3, max = 30, message ="Nombre Invalido: Debe tener de 3 a 30 caracteres ")
    private String firstname;
   
    private String lastname;
   
    @NotNull(message = "Tipo de documento Invalido: El tipo no debe ser NULL")
    private DocumentType documentType;
   
    private String document;
   
    private Date birthDate;
   
    private String docket;
   
    private String email;
   
    private String phone;
   
    private String address;

    //private LocalDateTime dateCreated;
    //private LocalDateTime dateUpdated;

    
}
