package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.CharacterPositionEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterPosition {

    private Long id;

    private CharacterPositionEnum characterPosition;

    private String name;
    
}
