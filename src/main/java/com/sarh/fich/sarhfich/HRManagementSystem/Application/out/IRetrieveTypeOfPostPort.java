package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

import java.util.List;

public interface IRetrieveTypeOfPostPort {
    List<TypeOfPost> fetchAll();
    TypeOfPost fetchById(Long id);
}
