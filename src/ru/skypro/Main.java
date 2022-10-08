package ru.skypro;

import ru.skypro.transport.Car;

import java.time.Year;

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

        Human Владимир = new Human(Year.now().getValue()-21,"Владимир","Казань",null);
        System.out.println(Владимир);

        Flower РозаОбыкновенная  = new Flower("Роза обыкновенная",null,"Голландия",35.59,null);
        Flower Хризантема = new Flower("Хризантема",null,null,15.0,5);
        Flower Пион = new Flower("Пион",null,"Англия",69.9,1);
        Flower Гипсофила = new Flower("Гипсофила",null,"Турция",19.5,10);
        System.out.println(РозаОбыкновенная);
        System.out.println(Хризантема);
        System.out.println(Пион);
        System.out.println(Гипсофила);
        int numRose = 3;
        int numChris = 5;
        int numPion = 0;
        int numGips = 1;
        Double flowerPrice =
                Math.round(
                        1.1*  //+10%
                                (numRose* РозаОбыкновенная.getCost()+
            numChris* Хризантема.getCost()+
            numPion* Пион.getCost()+
            numGips* Гипсофила.getCost()) //getCost
                                *100)/100d; //Todo: Загуглить другую функцию округления
        int lifeSpan = 0;
        if (numRose > 0)
            lifeSpan = РозаОбыкновенная.getLifeSpan();
        if (numChris > 0 && Хризантема.getLifeSpan()<lifeSpan)
            lifeSpan = Хризантема.getLifeSpan();
        if (numPion > 0 && Пион.getLifeSpan()<lifeSpan)
            lifeSpan = Пион.getLifeSpan();
        if (numGips > 0 && Гипсофила.getLifeSpan()<lifeSpan)
            lifeSpan = Гипсофила.getLifeSpan();

        System.out.println("будет стоить "+flowerPrice+" рублей и простоит "+lifeSpan+" суток. ");

        Car car7 = new Car("Lada","Grande","1,7л", "желтый", 2015,"Россия"
        , null, null, "A000XX000", null, null);
        System.out.println(car7);

    }
}
