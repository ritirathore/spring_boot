package com.wiley.sbconcept.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.wiley.sbconcept.response.model.ErrorMessage;
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DepNOTFoundException.class)
    public ResponseEntity<ErrorMessage> DepNOTFoundException(DepNOTFoundException ex, WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
    
    @ExceptionHandler(BookNOTFoundException.class)
    public ResponseEntity<ErrorMessage> BookNOTFoundException(BookNOTFoundException ex, WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}