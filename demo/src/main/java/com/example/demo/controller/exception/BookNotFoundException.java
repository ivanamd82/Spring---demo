package com.example.demo.controller.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {

    }
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public BookNotFoundException(final String message) {
        super(message);
    }
    public BookNotFoundException(final Throwable cause) {
        super(cause);
    }
}
