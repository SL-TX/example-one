package ru.skypro.exceptions;

public class WrongLoginException  extends  Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
