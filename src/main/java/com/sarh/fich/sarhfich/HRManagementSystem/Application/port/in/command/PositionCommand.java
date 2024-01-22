package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Transformation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionCommand {
    
    private Long postCode;

    private OrganizationalUnit organizationalUnit;

    private Point point;

    private PostStatus postStatus;

    private CharacterPosition characterPosition;

    private Transformation creationTransformation;

    private Transformation suppressionTransformation;
}
