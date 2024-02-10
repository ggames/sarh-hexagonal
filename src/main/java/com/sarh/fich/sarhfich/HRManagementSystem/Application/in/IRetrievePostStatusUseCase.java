package com.sarh.fich.sarhfich.HRManagementSystem.Application.in;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;

import java.util.List;

public interface IRetrievePostStatusUseCase {
        List<PostStatus> getAllPostStatus();
        PostStatus getPostStatusById(Long id);
}
