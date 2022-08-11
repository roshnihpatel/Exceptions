package com.sparta.rp.exceptions;

public class InvalidElementException extends RuntimeException {

    @Override
    public String getMessage() {
        return "You can not input a negative number";
    }
}
