package ru.skypro;

import ru.skypro.exceptions.WrongLoginException;
import ru.skypro.exceptions.WrongPasswordException;

import java.util.Objects;
import java.util.regex.Pattern;

public class NewClass {

    private static Boolean check(String string)
    {
        return Pattern.matches("^[A-Za-z0-9_]+$",string) && string.length() <=20 && string.length()>0;
    }

    public static Boolean method(String login,String  password , String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!check(login)){
            throw new WrongLoginException("Login incorrect");
        }
        if (!check(password) || !check(confirmPassword)) {
            throw new WrongPasswordException("Password incorrect");
        }
        if (!Objects.equals(password, confirmPassword)){
            throw new WrongPasswordException("Password incorrect");
        }
        return true;
    }
}
