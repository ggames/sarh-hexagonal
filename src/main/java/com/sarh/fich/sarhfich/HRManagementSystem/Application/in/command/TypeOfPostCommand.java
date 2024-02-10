package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import java.util.List;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfPostCommand {
    
    private Long id;

    private String namePost;

    private Double minimumWage;

    private Integer amountOfPostPoint;

    List<Point> points;

    
}
