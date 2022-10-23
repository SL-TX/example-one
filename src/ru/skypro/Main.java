package ru.skypro;

import ru.skypro.exceptions.DiagnosticFailException;
import ru.skypro.exceptions.WrongLoginException;
import ru.skypro.exceptions.WrongPasswordException;
import ru.skypro.exceptions.WrongRightsException;
import ru.skypro.transport.Car;
import ru.skypro.transport.CarBody;
import ru.skypro.transport.Driver;
import ru.skypro.transport.DriverB;

public class Main {
    public static void main(String[] args){
        String login = "1234", pass="43251", cpass="4321";
        try {
            Data.method(login,pass,cpass);
            System.out.println("Good");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        }
        try {
        Driver failDriver = new DriverB("asd",true,22,null);
            System.out.println("Good");
        } catch (WrongRightsException e){
            System.out.println(e);
        }
        Car car = new Car("asd","asd",1.3, CarBody.Кроссовер);
        if (!car.diagnostic()){
            try {
                throw new DiagnosticFailException();
            } catch (DiagnosticFailException e) {
                System.out.println(e);
            }
        }


    }
}
