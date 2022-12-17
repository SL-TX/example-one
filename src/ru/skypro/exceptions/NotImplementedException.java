package ru.skypro.exceptions;

public class NotImplementedException extends Exception {
    public NotImplementedException() {
        this("SomeClass");
    }

    public NotImplementedException(String message) {
        super(message + " not implemented");
    }
}
