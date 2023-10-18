package com.example.SmartPath.exception.global;

import com.example.SmartPath.exception.NotFoundException;
import com.example.SmartPath.exception.SaveException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity serviceExistHandler(NotFoundException e){
        String response =e.getMessage();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(SaveException.class)
    public ResponseEntity serviceExistHandler(SaveException e){
        String response =e.getMessage();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
