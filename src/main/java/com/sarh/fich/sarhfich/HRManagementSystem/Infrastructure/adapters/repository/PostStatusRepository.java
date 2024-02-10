package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.entity.PostStatusEntity;

public interface PostStatusRepository extends JpaRepository<PostStatusEntity, Long> {

    PostStatusEntity findByPostStatus(String postStatus);
}
