package com.ohgiraffers.exception.number;

public class NumberRangeException extends RuntimeException {
    public NumberRangeException() {
    }

    public NumberRangeException(String message) {
        super(message);
    }
}
