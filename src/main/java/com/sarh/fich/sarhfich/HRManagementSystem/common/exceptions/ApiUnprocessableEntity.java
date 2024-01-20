package com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnprocessableEntity  extends Exception{

    public ApiUnprocessableEntity(String message){
        super(message);
    }
    
}
