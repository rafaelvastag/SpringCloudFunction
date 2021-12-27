package com.vastag.azure.function.Functions.models;

public class UserResponse {
	
	private String message;

    public UserResponse() {
    }

    public UserResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
