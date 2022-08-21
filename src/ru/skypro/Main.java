package ru.skypro;

import java.util.Arrays;

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
        StringBuilder editedFullName=new StringBuilder();
        String[] sb;
        if (fullName.contains("ё")) {
            sb = fullName.split("ё");
            for (String s:sb) {
                editedFullName.append(s).append('е');
            }
            editedFullName.delete(editedFullName.length()-1,editedFullName.length());
        }
        System.out.println("Данные ФИО сотрудника — " + editedFullName);
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

    }
}
