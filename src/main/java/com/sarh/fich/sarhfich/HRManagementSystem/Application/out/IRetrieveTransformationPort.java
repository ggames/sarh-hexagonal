package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;

import java.util.List;

public interface IRetrieveTransformationPort {

    List<Transformation> fetchAll();

    Transformation fetchById(Long id);
}
