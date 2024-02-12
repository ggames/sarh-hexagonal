package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.ICreatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IRetrievePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdateAvailablePointsUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.IUpdatePointUseCase;
import com.sarh.fich.sarhfich.HRManagementSystem.Application.in.command.PointCommand;
import com.sarh.fich.sarhfich.HRManagementSystem.Domain.models.Point;
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

    private final IUpdateAvailablePointsUseCase updateAvailablePoints;
    public PointController(ICreatePointUseCase savePoint,
                           IUpdatePointUseCase updatePoint,
                           IRetrievePointUseCase retrievePoint,
                           IUpdateAvailablePointsUseCase updateAvailablePoints) {
        this.savePoint = savePoint;
        this.updatePoint = updatePoint;
        this.retrievePoint = retrievePoint;
        this.updateAvailablePoints = updateAvailablePoints;
    }

    @PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Point point){

        PointCommand command = PointCommand.builder()
                .pointCode(point.getPointCode())
                .typeOfPost(point.getTypeOfPost())
                .itemsPoint(point.getItemsPoint())
                .quantityAvailable(point.getQuantityAvailable())
                .missingQuantity(point.getMissingQuantity())
                .isTemporary(point.isTemporary())
                .rectorate(point.isRectorate()).build();

        savePoint.savePoint(command);
        if(command.getItemsPoint() != null){
            command.getItemsPoint().forEach(po -> {
                updateAvailablePoints.updateAvailablePointToCreatePoint(po.getId(), command.getMissingQuantity());
            } );

        }

    }

    @PutMapping(path = "update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  void update(@PathVariable Long id, @RequestBody Point point){
        PointCommand command = PointCommand.builder()
                .pointCode(point.getPointCode())
                .typeOfPost(point.getTypeOfPost())
                .quantityAvailable(point.getQuantityAvailable())
                .missingQuantity(point.getMissingQuantity())
                .isTemporary(point.isTemporary())
                .rectorate(point.isRectorate()).build();

        updatePoint.updatePoint(id, command);
    }

    @PutMapping(path = "assembly/{id}/{quantityPoint}")
    public void updateAvailablePointPerAssembly(@PathVariable Long id,@PathVariable Integer quantityPoint){

        updateAvailablePoints.updateAvailablePointPerAssembly(id, quantityPoint);
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
