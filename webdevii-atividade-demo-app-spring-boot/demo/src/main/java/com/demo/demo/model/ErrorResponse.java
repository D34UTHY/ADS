package com.demo.demo.model;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
    private String status;
    private String errorMessage;

    public ErrorResponse(HttpStatus status, String errorMessage) {
        this.status = status.name();
        this.errorMessage = errorMessage;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getErrorMessage() { return errorMessage; }
    public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }
}
