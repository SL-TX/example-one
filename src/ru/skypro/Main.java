package ru.skypro;

public class Main {
    public static void main(String[] args) {

//        Задание 1 и 2
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else //if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

//        Задание 2
        int clientDeviceYear = 2014;
        if (clientOS == 0)
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        else //if (clientOS == 1)
            if (clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");

//        Задание 3
        int year = 2022;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");

//        Задание 4
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 20)
            deliveryDays+=1;
        if (deliveryDistance >= 20)
        deliveryDays += (deliveryDistance + 20) / 40 + 1;
        System.out.println("Потребуется дней: " + deliveryDays);

//        Задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 1,2,12:
                System.out.println(monthNumber+" месяц принадлежит к сезону зима");
                break;
            case 3,4,5:
                System.out.println(monthNumber+" месяц принадлежит к сезону весна");
                break;
            case 6,7,8:
                System.out.println(monthNumber+" месяц принадлежит к сезону лето");
                break;
            case 9,10,11:
                System.out.println(monthNumber+" месяц принадлежит к сезону осень");
                break;
            default:
                throw new RuntimeException();
        }
    }
}
