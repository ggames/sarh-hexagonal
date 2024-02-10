package com.sarh.fich.sarhfich.HRManagementSystem.common;

public class CalculatePoints {

    public int CalculatePointsByParity(int pointsAvailableOrBusy, int pointQuantityByType , int pointsQuantity){

        double POINT_RATIO = (double)pointsAvailableOrBusy/pointQuantityByType;

        return (int)Math.round(POINT_RATIO* pointsQuantity);
    }
}
