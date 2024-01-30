package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePositionUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.Point;
import com.sarh.fich.sarhfich.HRManagementSystem.common.WebAdapter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@WebAdapter
@RestController
@RequestMapping("/sarh/point")
public class PointController {

    private final ICreatePointUseCase savePoint;
    private final IUpdatePointUseCase updatePoint;
    private final IRetrievePointUseCase retrievePoint;

    public PointController(ICreatePointUseCase savePoint,
                           IUpdatePointUseCase updatePoint,
                           IRetrievePointUseCase retrievePoint) {
        this.savePoint = savePoint;
        this.updatePoint = updatePoint;
        this.retrievePoint = retrievePoint;
    }

    @PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(Point point){

        PointCommand command = PointCommand.builder()
                .pointCode(point.getPointCode())
                .typeOfPost(point.getTypeOfPost())
                .quantityAvailable(point.getQuantityAvailable())
                .missingQuantity(point.getMissingQuantity())
                .isTemporary(point.isTemporary())
                .rectorate(point.isRectorate()).build();

        savePoint.savePoint(command);

    }

    @PutMapping(path = "update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void update(Long id, Point point){
        PointCommand command = PointCommand.builder()
                .pointCode(point.getPointCode())
                .typeOfPost(point.getTypeOfPost())
                .quantityAvailable(point.getQuantityAvailable())
                .missingQuantity(point.getMissingQuantity())
                .isTemporary(point.isTemporary())
                .rectorate(point.isRectorate()).build();

        updatePoint.updatePoint(id, command);
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Point>> getAll(){

        return ResponseEntity.ok(retrievePoint.getAllPoint());
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Point> getById(@PathVariable Long id){

        return  ResponseEntity.ok(retrievePoint.getPointById(id));
    }
}
