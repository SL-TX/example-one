package ru.skypro.exceptions;

public class DataInvalidException extends Exception{
    public DataInvalidException() {
        super("error");
    }

    public DataInvalidException(String message) {
        super(message);
    }
}
