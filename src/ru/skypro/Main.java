package ru.skypro;

import java.util.Arrays;

public class Main {
//Входные данные
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){

        int[] arr = generateRandomArray();

//        Задание 1
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

//        Задание 2
        int min = 0,max=0;
        for (int i : arr) {
            if (min ==0 || min > i)
                min = i;
            if (max ==0 || max < i)
                max = i;
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. " +
                        "Максимальная сумма трат за день составила "+max+" рублей");

//        Задание 3
        double avgMonth = sum/(double) arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+avgMonth+" рублей");

//        Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int j = reverseFullName.length - 1; j >= 0; j--) {
                System.out.print(reverseFullName[j]);
        }
    }
}
