package com.sarh.fich.sarhfich.HRManagementSystem.Domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Point {

    private Long id;

    private Long pointCode;

    private TypeOfPost typeOfPost;

    private Integer quantityAvailable;

    private Integer missingQuantity;

    List<ParentPoint> itemsPoint;

    private boolean isTemporary;

    private boolean rectorate;

    public void plus(Integer amount){
        this.quantityAvailable = this.quantityAvailable + amount;
    }

    public void subtract(Integer amount){

        this.quantityAvailable = this.quantityAvailable - amount;
    }

}
