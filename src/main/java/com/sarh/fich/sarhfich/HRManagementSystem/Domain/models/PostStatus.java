package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.List;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.PostStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostStatus {

    private Long id;

    private PostStatusEnum postStatus;

    private String name;
    
    List<Position> positions;

    
}
