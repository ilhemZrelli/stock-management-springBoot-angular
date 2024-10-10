package com.users.microservices.services.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ExpiredTokenException {
    private String message;
    public ExpiredTokenException (String message){
     super(message);
     }
    
}
