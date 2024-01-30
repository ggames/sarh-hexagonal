package com.sarh.fich.sarhfich.HRManagementSystem.Application.out;

import com.sarh.fich.sarhfich.HRManagementSystem.Domain.PostStatus;

import java.util.List;

public interface IRetrievePostStatusPort {

    List<PostStatus> fetchAll();

    PostStatus fetchById(Long id);
}
