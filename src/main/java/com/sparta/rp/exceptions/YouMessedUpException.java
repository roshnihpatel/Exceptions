package com.sparta.rp.exceptions;

public class YouMessedUpException extends Exception{
    public String getName() {
        return name;
    }

    private String name;

    public YouMessedUpException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "You messed up!";
    }
}
