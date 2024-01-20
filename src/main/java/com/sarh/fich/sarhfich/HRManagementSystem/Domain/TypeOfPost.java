package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfPost {
    
    private Long id;

    private String namePost;

    private Double minimumWage;

    private Integer amountOfPostPoint;
}
