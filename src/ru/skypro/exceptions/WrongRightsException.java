package ru.skypro.exceptions;

public class WrongRightsException extends Exception{

    public WrongRightsException() {
        super("Необходимо указать тип прав!");
    }
}
