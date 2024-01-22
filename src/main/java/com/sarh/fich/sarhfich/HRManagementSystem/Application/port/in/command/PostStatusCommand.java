package com.sarh.fich.sarhfich.HRManagementSystem.Application.port.in.command;

import com.sarh.fich.sarhfich.HRManagementSystem.common.enums.PostStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostStatusCommand {
    
    private PostStatusEnum postStatus;

    private String name; 
}
