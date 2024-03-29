package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;

import java.util.List;

public interface IRetrieveTransformationUseCase {

      List<Transformation> getAllTransformation();

      Transformation getTransformationById(Long id);
}
