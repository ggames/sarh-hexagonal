package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;

import java.util.List;

public interface IRetrieveTypeOfPostUseCase {
    List<TypeOfPost> getAllTypeOfPost();
    TypeOfPost getTypeOfPostById(Long id);
}
