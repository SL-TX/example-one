package ru.skypro;

import ru.skypro.products.Товар;

import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
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
        var texhStantion = new TechStantion<>();
        for (Transport car: cars) {
            System.out.println(
                    "Для машины: " +car.toString()+"\n"+
                            "Водитель: " + car.getDriver().toString()+"\n"+
                            "Спонсоры: " + car.getSponsorsList().toString()+"\n"+
                            "Механики: " + car.getMechanicList().toString()
            );
            texhStantion.addToQueue(car);
        }
        texhStantion.doTechOsmotr();
        texhStantion.doTechOsmotr();
        texhStantion.doTechOsmotr();
        texhStantion.doTechOsmotr();
        texhStantion.doTechOsmotr();

        //Part 2
        List<Queue<String>> q1 = new ArrayList<>();
        q1.add(new ArrayDeque<>(5));
        q1.add(new ArrayDeque<>(5));
        q1.get(0).offer("11");
        q1.get(0).offer("12");
        q1.get(0).offer("13");
        q1.get(0).offer("14");
        q1.get(0).offer("15");
        q1.get(1).offer("16");
        addInSomeQueue(q1,"qs1");
        addInSomeQueue(q1,"qs2");
        addInSomeQueue(q1,"qs3");
        addInSomeQueue(q1,"qs4");
        addInSomeQueue(q1,"qs5");
        addInSomeQueue(q1,"qs6");
        addInSomeQueue(q1,"qs7");
        addInSomeQueue(q1,"qs8");
        addInSomeQueue(q1,"qs9");
        removeFromSomeQueue(q1);
        removeFromSomeQueue(q1);
        removeFromSomeQueue(q1);
        removeFromSomeQueue(q1);
        for (var qqq: q1
        ) {
            System.out.println(qqq.size());
        }

        //Часть 3
        List<List<String>> biDemArrList = new ArrayList<>();
//        int ourNumber = biDemArrList.get(0).get(1)
//        List> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i+j)%2==1?"●":"◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println("\n");
        }
         */
        Set<Товар> СписокТоваров = new HashSet<>();
        Товар Бананы = new Товар("Банан", 120,10);
        Товар Апельсины = new Товар("Апельсин", 240,10);
        try {
            Товар Тест = new Товар("Тест", 240,null);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
        addToSet(СписокТоваров,Бананы);
        addToSet(СписокТоваров,Апельсины);
        addToSet(СписокТоваров,Бананы);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            remFromSet(СписокТоваров,Бананы);
            remFromSet(СписокТоваров,Бананы);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(СписокТоваров.toArray()));

    }

    private static void addToSet(Set<Товар> set, Товар val){
        if (!set.add(val)){
            throw new RuntimeException("необходимо выбросить исключение");
        }
    }

    private static void remFromSet(Set<Товар> set, Товар val){
        if(!set.remove(val)){
            throw new RuntimeException("Ошибка удаления товара");
        }
    }

    private static void addInSomeQueue(List<Queue<String>> q1, String val){
        Queue<String> minindex;
        int coun = 99;
        boolean addded = false;
        minindex=q1.get(0);
        for (var qqq: q1
             ) {
            System.out.println(qqq.size());
            if (qqq.size()==5) { continue;}
            if (coun >= qqq.size()) {
                coun = qqq.size();
                minindex = qqq;
                addded = true;
            }
        }
        if (!addded){
            System.out.println("полное заполнение всех очередей");
            q1.add(new ArrayDeque<>(5));
            minindex = q1.get(q1.size()-1);
        }
        minindex.offer(val);
//        System.out.println(q1.get(0).size());
//        System.out.println(q1.get(1).size());
    }

    private static void removeFromSomeQueue(List<Queue<String>> q1){
        int num = (int) Math.round(Math.random()* (q1.size()-1));
        q1.get(num).poll();
    }
}
