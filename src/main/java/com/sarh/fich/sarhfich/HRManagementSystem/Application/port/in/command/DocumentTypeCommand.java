package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentTypeCommand {

    private String type;
    
}