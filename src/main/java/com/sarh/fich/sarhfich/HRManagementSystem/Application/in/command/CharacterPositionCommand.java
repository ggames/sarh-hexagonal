package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.CharacterPositionEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CharacterPositionCommand {
    private CharacterPositionEnum characterPosition;
    private String nameCharacter;

   
}
