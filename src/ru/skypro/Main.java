package ru.skypro;

import ru.skypro.exceptions.WrongRightsException;
import ru.skypro.transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Transport> cars = new ArrayList<>();
        List<Sponsor> sponsors = new ArrayList<>();
        List<Driver> drivers = new ArrayList<>();

        cars.add(new Car("ad1","asd",2.2,CarBody.Универсал));
        cars.add(new Car("as2","a6sd",2.2,CarBody.Универсал));
        cars.add(new Bus("as3","a7sd",2.2,BusType.малая));
        cars.add(new Truck("ag4","8asd",2.2,TruckBody.N2));

        sponsors.add(new Sponsor("asdf1", 1234));
        sponsors.add(new Sponsor("asdf2", 12345));
        sponsors.add(new Sponsor("asdf3", 123465));
        sponsors.add(new Sponsor("asdf4", 1234567));
        try {
            drivers.add(new DriverB("asd1", true, 2, (Car) cars.get(0)));
            drivers.add(new DriverB("asd2", true, 2, (Car) cars.get(1)));
            drivers.add(new DriverD("asd3", true, 2, (Bus) cars.get(2)));
            drivers.add(new DriverC("asd4", true, 2, (Truck) cars.get(3)));
        }
        catch (WrongRightsException e){
            System.out.println(e);
        }
        Mechanic mech1 = new Mechanic("a","b","asd",List.of("Car"));
        Mechanic mech2 = new Mechanic("c","d","dsa",List.of("Bus","Truck"));

        cars.get(0).addMechanic(mech1);
        cars.get(1).addMechanic(mech1);
        cars.get(2).addMechanic(mech1);
        cars.get(2).addMechanic(mech2);
        cars.get(3).addMechanic(mech2);
        cars.get(0).setDriver(drivers.get(0));
        cars.get(1).setDriver(drivers.get(1));
        cars.get(2).setDriver(drivers.get(2));
        cars.get(3).setDriver(drivers.get(3));
        cars.get(0).addSponsor(sponsors.get(0));
        cars.get(1).addSponsor(sponsors.get(1));
        cars.get(2).addSponsor(sponsors.get(0));
        cars.get(3).addSponsor(sponsors.get(1));
        cars.get(0).addSponsor(sponsors.get(2));
        cars.get(1).addSponsor(sponsors.get(3));

        for (Transport car: cars) {
            System.out.println(
                    "Для машины: " +car.toString()+"\n"+
                            "Водитель: " + car.getDriver().toString()+"\n"+
                            "Спонсоры: " + car.getSponsorsList().toString()+"\n"+
                            "Механики: " + car.getMechanicList().toString()
            );

        }
    }
}
