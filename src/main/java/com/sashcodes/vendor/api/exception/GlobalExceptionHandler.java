package com.sashcodes.vendor.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VendorNotFoundException.class)
    public ResponseEntity<Object> handleException(VendorNotFoundException exception) {
        ErrorResponse response = new ErrorResponse(exception.getMessage()
                , exception.getCause(), HttpStatus.CONFLICT);

        return new ResponseEntity<>(response, response.getHttpStatus());

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleDataValidationException(MethodArgumentNotValidException exception) {
        Map<String, String> errorMap = new HashMap<>();
        exception.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        ErrorResponse response = new ErrorResponse(exception.getMessage()
                , exception.getCause(), HttpStatus.BAD_REQUEST, errorMap);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }
}
