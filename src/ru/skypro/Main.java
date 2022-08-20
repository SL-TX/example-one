package ru.skypro;

public class Main {
    public static void main(String[] args) {
//        Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + ' ' + lastName + ' ' + middleName;
        System.out.println(fullName);

//        Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

//        Задание 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

    }
}
