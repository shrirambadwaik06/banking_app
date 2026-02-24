package com.shriram.smartbank.exception;

public class CustomBusinessException extends RuntimeException{

    public CustomBusinessException(String message) {
        super(message);
    }
}
