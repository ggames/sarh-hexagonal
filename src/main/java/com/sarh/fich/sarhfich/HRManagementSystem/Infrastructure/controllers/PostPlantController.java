package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePostPlantUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PostPlantCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.PostPlant;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping("/sarh/postplant")
public class PostPlantController {

    private final ICreatePostPlantUseCase savePostPlant;
    private final IUpdatePostPlantUseCase updatePostPlant;

    private final IRetrievePostPlantUseCase retrievePostPlant;

    public PostPlantController(ICreatePostPlantUseCase savePostPlant,
                               IUpdatePostPlantUseCase updatePostPlant,
                               IRetrievePostPlantUseCase retrievePostPlant) {
        this.savePostPlant = savePostPlant;
        this.updatePostPlant = updatePostPlant;
        this.retrievePostPlant = retrievePostPlant;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(PostPlantCommand postPlant){

        savePostPlant.savePostPlant(postPlant);

    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(Long id, PostPlantCommand command){

        updatePostPlant.updatePostPlant(id, command);
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PostPlant>> getAll(){

        return ResponseEntity.ok(retrievePostPlant.getAllPostPlant());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostPlant> getById(Long id){

        return ResponseEntity.ok(retrievePostPlant.getPostPlantById(id));

    }
}
