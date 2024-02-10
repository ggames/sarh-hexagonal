package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PositionCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Position;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping(path = "/sarh/position")
public class PositionController {

    private final ICreatePositionUseCase savePosition;
    private final IUpdatePositionUseCase updatePosition;
    private final IRetrievePositionUseCase retrievePosition;


    public PositionController(ICreatePositionUseCase savePosition,
                              IUpdatePositionUseCase updatePosition,
                              IRetrievePositionUseCase retrievePosition) {
        this.savePosition = savePosition;
        this.updatePosition = updatePosition;
        this.retrievePosition = retrievePosition;
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Position position){
        PositionCommand command = PositionCommand.builder()
                .postCode(position.getPostCode())
                .point(position.getPoint())
                .characterPosition(position.getCharacterPosition())
                .organizationalUnit(position.getOrganizationalUnit())
                .postStatus(position.getPostStatus())
                .creationTransformation(position.getCreationTransformation())
                .suppressionTransformation(position.getSuppressionTransformation()).build();

        savePosition.savePosition(command);
    }

    public void update(@PathVariable Long id, @RequestBody Position position){
        PositionCommand command = PositionCommand.builder()
                .postCode(position.getPostCode())
                .point(position.getPoint())
                .characterPosition(position.getCharacterPosition())
                .organizationalUnit(position.getOrganizationalUnit())
                .postStatus(position.getPostStatus())
                .creationTransformation(position.getCreationTransformation())
                .suppressionTransformation(position.getSuppressionTransformation()).build();

        updatePosition.updatePosition(id, command);
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Position>> getAll(){

        return ResponseEntity.ok(retrievePosition.getAllPosition());

    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Position> getById(@PathVariable Long id){

        return ResponseEntity.ok(retrievePosition.getPositionById(id));
    }

}
