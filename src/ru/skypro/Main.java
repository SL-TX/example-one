package ru.skypro;

import ru.skypro.exceptions.WrongLoginException;
import ru.skypro.exceptions.WrongPasswordException;

import java.io.Console;

public class Main {
    public static void main(String[] args){
        String login = "1234", pass="43251", cpass="4321";
        try {
            NewClass.method(login,pass,cpass);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        } finally {
            System.out.println("Good");
        }
    }
}
