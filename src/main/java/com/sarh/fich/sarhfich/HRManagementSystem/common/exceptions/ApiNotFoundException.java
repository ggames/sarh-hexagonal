package com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFoundException extends Exception {

    public ApiNotFoundException(String message){
        super(message);
    }
    
}
