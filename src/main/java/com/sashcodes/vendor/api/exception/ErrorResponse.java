package com.sashcodes.vendor.api.exception;

import org.springframework.http.HttpStatus;

import java.util.Map;

public class ErrorResponse {
    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;
    private Map<String, String> errorsDetails;

    public ErrorResponse(String message, Throwable throwable, HttpStatus httpStatus, Map<String, String> errorsDetails) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.errorsDetails = errorsDetails;
    }

    public ErrorResponse(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    public Map<String, String> getErrorsDetails() {
        return errorsDetails;
    }

    public void setErrorsDetails(Map<String, String> errorsDetails) {
        this.errorsDetails = errorsDetails;
    }
}
