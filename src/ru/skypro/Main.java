package ru.skypro;

import java.time.LocalDate;

public class Main {

    //  Задание 1
    private static String checkLeapYear(Integer year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return year + " год является високосным";
        else
            return year + " год не является високосным";
    }

    //  Задание 2
    enum PhoneType {
        iOS, Android
    }

    private static String checkLightVersion(PhoneType type, Integer clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean useLightVesion = false;
        if (type == PhoneType.iOS) {
            if (clientDeviceYear < currentYear) {
                useLightVesion = true;
            }
        } else { //if (type == PhoneType.Android)
            if (clientDeviceYear < currentYear) {
                useLightVesion = true;
            }
        }
        return "Установите " + (useLightVesion ? "облегченную " : "") + "версию приложения для " + type.name() + " по ссылке";
    }

    // Задание 3
    private static Integer calculateDeliveryDistanceTime(Integer deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20)
            deliveryDays += 1;
        if (deliveryDistance >= 20)
            deliveryDays += (deliveryDistance + 20) / 40 + 1;
        return deliveryDays;
    }

    public static void main(String[] args) {
//      Задание 1
        System.out.println(checkLeapYear(2024));
//      Задание 2
        System.out.println(checkLightVersion(PhoneType.Android, 2022));
//      Задание 3
        System.out.println("Потребуется дней: " + calculateDeliveryDistanceTime(95));
    }
}
