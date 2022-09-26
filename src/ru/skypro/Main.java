package ru.skypro;

public class Main {
    public static void main(String[] args){
        Human Максим = new Human(1987,"Максим","Минск","бренд-менеджер");
        Human Аня = new Human(1993,"Аня","Москва","методист образовательных программ");
        Human Катя = new Human(1994,"Катя","Калининград","продакт-менеджер");
        Human Артем = new Human(1995,"Артем",null,"директор по развитию бизнеса");
        System.out.println(Максим);
        System.out.println(Аня);
        System.out.println(Катя);
        System.out.println(Артем);

        Car car1 = new Car("Lada","Grande","1,7л", "желтый", 2015,"Россия");
        Car car2 = new Car("Audi","A8 50 L TDI quattro","3.0л" , "черный",2020, "Германия");
        Car car3 = new Car("BMW","Z8", "3.0л", "черный",2021,"Германия");
        Car car4 = new Car("Kia","Sportage 4 поколение","2,4л" , "красный ", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai","Avante","1,6л",  "оранжевый",  2016,"Южная Корея");
        Car car6 = new Car();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);


    }
}
