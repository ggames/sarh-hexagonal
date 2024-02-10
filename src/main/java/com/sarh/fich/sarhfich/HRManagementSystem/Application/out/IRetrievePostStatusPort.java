package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.AgentCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;

import java.util.List;

public interface IRetrievePostStatusPort {

    List<PostStatus> fetchAll();

    PostStatus fetchById(Long id);

    PostStatus fetchByPostStatus(String poststatus);
}
