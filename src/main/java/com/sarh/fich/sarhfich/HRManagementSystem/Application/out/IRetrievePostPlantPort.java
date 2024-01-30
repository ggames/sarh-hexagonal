package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;

import java.util.List;

public interface IRetrievePostPlantPort {

    List<PostPlant> fetchAll();

    PostPlant fetchById(Long id);
}
