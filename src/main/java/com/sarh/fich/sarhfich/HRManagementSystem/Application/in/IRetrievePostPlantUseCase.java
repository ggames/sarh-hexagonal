package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostPlant;

import java.util.List;

public interface IRetrievePostPlantUseCase {

    List<PostPlant> getAllPostPlant();

    PostPlant getPostPlantById(Long id);

}
