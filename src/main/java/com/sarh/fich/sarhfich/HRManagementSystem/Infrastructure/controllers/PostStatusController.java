package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostStatusUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostStatus;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/poststatus")
public class PostStatusController {

    private final IRetrievePostStatusUseCase retrievePostStatus;

    public PostStatusController(IRetrievePostStatusUseCase retrievePostStatus) {
        this.retrievePostStatus = retrievePostStatus;
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PostStatus>> getAll(){

        return ResponseEntity.ok(retrievePostStatus.getAllPostStatus());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostStatus>getById(Long id){

        return  ResponseEntity.ok(retrievePostStatus.getPostStatusById(id));
    }
}
