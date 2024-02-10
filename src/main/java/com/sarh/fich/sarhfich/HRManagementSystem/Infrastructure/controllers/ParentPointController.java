package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrieveParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateParentPointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.ParentPointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.ParentPoint;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/parentpoint")
public class ParentPointController {

    private final ICreateParentPointUseCase saveParentPoint;

    private final IUpdateParentPointUseCase updateParentPoint;

    private final IRetrieveParentPointUseCase retrieveParentPoint;

    public ParentPointController(ICreateParentPointUseCase saveParentPoint,
                                 IUpdateParentPointUseCase updateParentPoint,
                                 IRetrieveParentPointUseCase retrieveParentPoint) {
        this.saveParentPoint = saveParentPoint;
        this.updateParentPoint = updateParentPoint;
        this.retrieveParentPoint = retrieveParentPoint;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody ParentPoint parentPoint){
        ParentPointCommand command = ParentPointCommand.builder()
                .childPoint(parentPoint.getChildPoint())
                .parenPoint(parentPoint.getParentPoint())
                .occupiedQuantity(parentPoint.getOccupiedQuantity())
                .build();
        saveParentPoint.saveParentPoint(command);
    }
    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(Long id, ParentPoint parentPoint){
        ParentPointCommand command = ParentPointCommand.builder()
                .childPoint(parentPoint.getChildPoint())
                .parenPoint(parentPoint.getParentPoint())
                .occupiedQuantity(parentPoint.getOccupiedQuantity())
                .build();

        updateParentPoint.updateParentPoint(id, command);
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ParentPoint>> getAll(){

        return ResponseEntity.ok(retrieveParentPoint.getAllParentPoint());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ParentPoint> getById(Long id){

        return ResponseEntity.ok(retrieveParentPoint.getParentPointById(id));
    }

}
