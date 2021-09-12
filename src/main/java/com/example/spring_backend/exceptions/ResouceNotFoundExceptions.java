package com.example.spring_backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResouceNotFoundExceptions extends RuntimeException {

    private static final long serialversionUID=1L;

    public ResouceNotFoundExceptions(String message){
        super(message);
    }

}
