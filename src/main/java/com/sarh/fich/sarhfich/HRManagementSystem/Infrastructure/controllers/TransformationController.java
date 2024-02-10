package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateTransformationUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.TransformationCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Transformation;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/transformation")
public class TransformationController {

    private final IRetrieveTransformationUseCase retrieveTransformation;
    private final ICreateTransformationUseCase saveTransformation;
    private final IUpdateTransformationUseCase updateTransformation;

    public TransformationController(IRetrieveTransformationUseCase retrieveTransformation,
                                    ICreateTransformationUseCase saveTransformation,
                                    IUpdateTransformationUseCase updateTransformation) {
        this.retrieveTransformation = retrieveTransformation;
        this.saveTransformation = saveTransformation;
        this.updateTransformation = updateTransformation;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Transformation transformation) {
        TransformationCommand command = TransformationCommand.builder()
                .resolutionNumber(transformation.getResolutionNumber())
                .transformationResult(transformation.getTransformationResult()).build();

        saveTransformation.saveTransformation(command);
    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable Long id, @RequestBody Transformation transformation){

        TransformationCommand command = TransformationCommand.builder()
                .resolutionNumber(transformation.getResolutionNumber())
                .transformationResult(transformation.getTransformationResult()).build();

        updateTransformation.updateTransformation(id, command);
    }

    @GetMapping(path = "transformation/all")
    public ResponseEntity<List<Transformation>> getAllTransformations(){

        return ResponseEntity.ok(retrieveTransformation.getAllTransformation());
    }
}
