package ru.skypro;

import ru.skypro.transport.Bus;
import ru.skypro.transport.Car;
import ru.skypro.transport.Transport;
import ru.skypro.transport.Truck;

public class Main {
    public static void main(String[] args){
        Transport car1 = new Car("brand1","car1",1.6);
        Transport car2 = new Car("brand2","car2",2.0);
        Transport bus1 = new Bus("brand1","bus1",3.0);
        Transport truck1 = new Truck("brand2","truck1",4.0);
        car1.startMoving();
        car2.startMoving();
        bus1.startMoving();
        truck1.startMoving();
        truck1.stopMoving();
        car1.stopMoving();
        bus1.stopMoving();
        car2.stopMoving();
    }
}
