package ru.skypro;

public class Main {
    public static void main(String[] args){
//        Задание 1
        int i =10;
        while (i>0){
            System.out.print(i-- + " ");
        }
        System.out.println();
        for (i=1;i<=10;i++)
            System.out.print(i + " ");
        System.out.println();

//        Задание 2
        int firstFriday =4;
        for (i=1;i<=31;i++)
            if(i % 7 == firstFriday)
                System.out.println("Сегодня пятница, "+i+"-е число. Необходимо подготовить отчет.");

//        Задание 3
        int magic = 79;
        int year = 2022;
        for (i = year-200;i<=year+100;i++)
            if(i%magic == 0)
                System.out.println(i);

    }
}
