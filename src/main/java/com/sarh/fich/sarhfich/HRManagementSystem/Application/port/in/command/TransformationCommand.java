package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransformationCommand {
    
    private String resolutionNumber;

    private String transformationResult;
}
