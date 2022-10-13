package ru.skypro;

import ru.skypro.transport.*;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("brand1","car1",1.6);
        Transport car2 = new Car("brand2","car2",2.0);
        Bus bus1 = new Bus("brand1","bus1",3.0);
        Truck truck1 = new Truck("brand2","truck1",4.0);
        car1.startMoving();
        car2.startMoving();
        bus1.startMoving();
        truck1.startMoving();
        truck1.stopMoving();
        car1.stopMoving();
        bus1.stopMoving();
        car2.stopMoving();
        car1.pitStop();
        car1.bestTime();
        car1.maxSpeed();
        truck1.pitStop();
        truck1.bestTime();
        truck1.maxSpeed();
        bus1.pitStop();
        bus1.bestTime();
        bus1.maxSpeed();
        Driver<Car> driver1 = new Driver<>("F I O 1", true,5);
        Driver<Transport> driver2 = new Driver<>("F I O 2", false,0);
        Driver<Bus> driver3 = new Driver<>("F I O 3", true,9);
        Driver<Truck> driver4 = new Driver<>("F I O 4", true,7);
        driver1.refill(car1);
        driver2.refill(car2);
        driver3.refill(bus1);
        driver4.refill(truck1);
    }
}
