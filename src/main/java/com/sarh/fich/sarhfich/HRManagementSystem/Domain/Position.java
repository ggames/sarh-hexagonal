package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    
    private Long id;

    private Long postCode;

    private OrganizationalUnit organizationalUnit;

    private Point point;

    private PostStatus postStatus;

    private CharacterPosition characterPosition;

    private Transformation creationTransformation;

    private Transformation suppressionTransformation;
}
