package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Agent;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;

import java.util.List;

public interface IRetrievePostPlantPort {

    List<PostPlant> fetchAll();

    PostPlant fetchById(Long id);

    List<PostPlant> fetchByAgent(Agent agent);
}
