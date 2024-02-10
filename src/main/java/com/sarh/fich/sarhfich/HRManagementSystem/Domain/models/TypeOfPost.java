package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.List;

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

    List<Point> points;
}
