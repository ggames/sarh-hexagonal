package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateTypeOfPostUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TypeOfPostCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.TypeOfPost;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/typeofpost")
public class TypeOfPostController {
    private final ICreateTypeOfPostUseCase saveTypeofPost;
    private final IUpdateTypeOfPostUseCase updateTypeofPost;
    private final IRetrieveTypeOfPostUseCase retrieveTypeOfPost;

    public TypeOfPostController(ICreateTypeOfPostUseCase saveTypeofPost,
                                IUpdateTypeOfPostUseCase updateTypeofPost,
                                IRetrieveTypeOfPostUseCase retrieveTypeOfPost) {
        this.saveTypeofPost = saveTypeofPost;
        this.updateTypeofPost = updateTypeofPost;
        this.retrieveTypeOfPost = retrieveTypeOfPost;
    }

    @PostMapping(path = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody TypeOfPost typeOfPost){

        TypeOfPostCommand command = TypeOfPostCommand.builder()
                .namePost(typeOfPost.getNamePost())
                .amountOfPostPoint(typeOfPost.getAmountOfPostPoint())
                .minimumWage(typeOfPost.getMinimumWage())
                .build();

        saveTypeofPost.saveTypeOfPost(command);
    }

    @PutMapping(path = "update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable Long id, @RequestBody TypeOfPost type){

           TypeOfPostCommand command = TypeOfPostCommand.builder()
                   .namePost(type.getNamePost())
                   .amountOfPostPoint(type.getAmountOfPostPoint())
                   .minimumWage(type.getMinimumWage()).build();

           updateTypeofPost.updateTypeOfPost(id, command);
    }

    public ResponseEntity<List<TypeOfPost>> getAllTypeOfPost(){

        return ResponseEntity.ok(retrieveTypeOfPost.getAllTypeOfPost());
    }
}
