package com.indusnet.Restaurant_booking.exception;

public class UnprocessableException extends RuntimeException{
    public UnprocessableException(String message) {
        super(message);
    }
}