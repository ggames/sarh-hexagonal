package com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.CharacterPosition;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.OrganizationalUnit;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
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
