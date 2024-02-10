package com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sarh.fich.sarhfich.HRManagementSystem.Exceptions.BusinessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sarh.fich.sarhfich.HRManagementSystem.Infrastructure.adapters.error.ErrorDTO;

@RestControllerAdvice
public class ControllerAdvice {
   
/*     @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO>handleValidationException(MethodArgumentNotValidException ex){
        ErrorDTO error = ErrorDTO.builder().code("P-400").message("null")
    }
 */
@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, List<String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ErrorDTO> runtimeExceptionHandler(RuntimeException ex) {

        ErrorDTO error = ErrorDTO.builder().code("P-500").message(ex.getMessage()).build();

        return new ResponseEntity<ErrorDTO>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorDTO> businessExceptionHandler(BusinessException ex){
        ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).message(ex.getMessage()).build();

        return new ResponseEntity<ErrorDTO>(error, ex.getStatus());
    }

  

     private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }
}
