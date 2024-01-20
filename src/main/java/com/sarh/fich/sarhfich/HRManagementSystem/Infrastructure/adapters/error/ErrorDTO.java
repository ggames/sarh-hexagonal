package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.error;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDTO {
       
    private String code;

    private String message;
}
