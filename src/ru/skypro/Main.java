package ru.skypro;

import ru.skypro.exceptions.WrongRightsException;
import ru.skypro.products.Recept;
import ru.skypro.products.Product;
import ru.skypro.transport.*;

import java.util.*;

import static ru.skypro.Utils.addToSet;
import static ru.skypro.Utils.remFromSet;

public class Main {
    public static void main(String[] args){
        Set<Transport> cars = new HashSet<>();
        Set<Sponsor> sponsors = new HashSet<>();
        Set<Driver> drivers = new HashSet<>();
        var car1 = new Car("ad1","asd",2.2,CarBody.CROSSOVER);
        var car2 = new Car("as2","a6sd",2.2,CarBody.CROSSOVER);
        var car3 = new Bus("as3","a7sd",2.2, BusType.SMALL);
        var car4 = new Truck("ag4","8asd",2.2,TruckBody.N2);

        addToSet(cars,car1);
        addToSet(cars,car2);
        addToSet(cars,car3);
        addToSet(cars,car4);

        var sponsor1 = new Sponsor("asdf1", 1234);
        var sponsor2 = new Sponsor("asdf2", 12345);
        var sponsor3 = new Sponsor("asdf3", 123465);
        var sponsor4 = new Sponsor("asdf4", 1234567);

        addToSet(sponsors,sponsor1);
        addToSet(sponsors,sponsor2);
        addToSet(sponsors,sponsor3);
        addToSet(sponsors,sponsor4);

        Driver driver1 = null;
        Driver driver2 = null;
        Driver driver3 = null;
        Driver driver4 = null;

        try {
            driver1 = new DriverB("asd1", true, 2, car1);
            driver2 = new DriverB("asd2", true, 2, car2);
            driver3 = new DriverD("asd3", true, 2, car3);
            driver4 = new DriverC("asd4", true, 2, car4);

            addToSet(drivers,driver1);
            addToSet(drivers,driver2);
            addToSet(drivers,driver3);
            addToSet(drivers,driver4);
        }
        catch (WrongRightsException e){
            System.out.println(e);
        }
        Set<Mechanic> setMechanic = new HashSet<>();
        Mechanic mech1 = new Mechanic("a","b","asd",List.of("Car"));
        Mechanic mech2 = new Mechanic("c","d","dsa",List.of("Bus","Truck"));

        addToSet(setMechanic,mech1);
        addToSet(setMechanic,mech2);

        car1.addMechanic(mech1);
        car2.addMechanic(mech1);
        car3.addMechanic(mech1);
        car3.addMechanic(mech2);
        car4.addMechanic(mech2);
        car1.addDrivers(driver1);
        car2.addDrivers(driver2);
        car3.addDrivers(driver3);
        car4.addDrivers(driver4);
        car1.addSponsor(sponsor1);
        car2.addSponsor(sponsor2);
        car3.addSponsor(sponsor1);
        car4.addSponsor(sponsor2);
        car1.addSponsor(sponsor3);
        car2.addSponsor(sponsor4);
//        var texhStantion = new TechStantion<>();
//        for (Transport car: cars) {
//            System.out.println(
//                    "Для машины: " +car.toString()+"\n"+
//                            "Водитель: " + car.getDriver().toString()+"\n"+
//                            "Спонсоры: " + car.getSponsorsList().toString()+"\n"+
//                            "Механики: " + car.getMechanicList().toString()
//            );
//            texhStantion.addToQueue(car);
//        }
//        texhStantion.doTechOsmotr();
//        texhStantion.doTechOsmotr();
//        texhStantion.doTechOsmotr();
//        texhStantion.doTechOsmotr();
//        texhStantion.doTechOsmotr();

        Set<Product> setOfProducts = new HashSet<>();
        Product banana = new Product("Банан", 120,10);
        Product orange = new Product("Апельсин", 240,10);
        try {
            Product test = new Product("Тест", 240,null);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
        addToSet(setOfProducts,banana);
        addToSet(setOfProducts,orange);
        addToSet(setOfProducts,banana);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            remFromSet(setOfProducts,banana);
            remFromSet(setOfProducts,banana);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(setOfProducts.toArray()));
        addToSet(setOfProducts,banana);
        Set<Recept> SpisokReceptov = new HashSet<>();
        Recept recept1 = new Recept(setOfProducts,"Рецепт 1");
        Recept recept2 = new Recept(setOfProducts,"Рецепт 2");
        try {
            addToSet(SpisokReceptov, recept1);
            addToSet(SpisokReceptov, recept2);
            addToSet(SpisokReceptov, recept1);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(SpisokReceptov.toArray()));
        Set<Integer> manyIntVals = new HashSet<>();
        for (int i=0;i<20;i++){
            manyIntVals.add((int) Math.round(Math.random()*1000));
        }
        System.out.println(List.of(manyIntVals.toArray()));
        manyIntVals.removeIf(i ->  i % 2 == 1);
        System.out.println(List.of(manyIntVals.toArray()));

        for (var element:sponsors) {
            System.out.println(element);
        }
        for (var element:cars) {
            System.out.println(element);
        }
        for (var element:drivers) {
            System.out.println(element);
        }
        for (var element:setMechanic) {
            System.out.println(element);
        }
        //part 2
        Set<String> uniqueQuestion = new HashSet<>();
        do {
            Random r = new Random();
            int int1 = r.nextInt(7)+2;
            int int2 = r.nextInt(7)+2;
            if (!uniqueQuestion.contains(int2 + "*" + int1)) {
                uniqueQuestion.add(int1 + "*" + int2);
            }

        } while (uniqueQuestion.size()<=14);//numRows - 1
        for (var element:uniqueQuestion) {
            System.out.println(element);
        }
        //part 3

        Passport passport1 = new Passport("1234","1234","1234","1234","12.12.12");
        Passport passport2 = new Passport("4321","4321","4321","4321","01.12.12");
        HashMap<String,Passport> passportHashMap = new HashMap<>();
        passportHashMap.put(passport1.getNumPassport(),passport1);
        passportHashMap.put(passport2.getNumPassport(),passport2);
        passportHashMap.put(passport1.getNumPassport(),passport1);
        Passport passport3 = new Passport("1234","1234","4321","1234","12.01.12");
        savePassport(passportHashMap,passport3);
        System.out.println(getPassport(passportHashMap,"1234"));

    }

    public static void savePassport(Map<String, Passport> refMap, Passport passport){
        if (refMap.containsKey(passport.getNumPassport())){
            refMap.remove(passport.getNumPassport());
            refMap.put(passport.getNumPassport(), passport);
        } else
            refMap.put(passport.getNumPassport(), passport);
    }

    public static Passport getPassport(Map<String,Passport> refMap, String key){
        return refMap.getOrDefault(key, null);
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
