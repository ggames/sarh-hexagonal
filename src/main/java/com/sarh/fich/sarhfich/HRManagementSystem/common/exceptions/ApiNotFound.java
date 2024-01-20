package com.sarh.fich.sarhfich.HRManagementSystem.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFound extends Exception {
    
    
}
