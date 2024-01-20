package com.sarh.fich.sarhfich.HRManagementSystem.Domain;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.PostStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostStatus {

    private Long id;

    private PostStatusEnum postStatus;

    private String name;
    
}
