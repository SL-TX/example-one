package ru.skypro;

public class Main {
    public static void main(String[] args) {

//        Задание 1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.986};
        char[] charArray = {'G', 'O', 'O', 'D'};

//        Задание 2
        for (int j = 0; j < intArray.length; j++) {
            if (j == intArray.length - 1)
                System.out.print(intArray[j]);
            else
                System.out.print(intArray[j] + ",");
        }
        System.out.println();
        for (int j = 0; j < doubleArray.length; j++) {
            if (j == doubleArray.length - 1)
                System.out.print(doubleArray[j]);
            else
                System.out.print(doubleArray[j] + ",");
        }
        System.out.println();
        for (int j = 0; j < charArray.length; j++) {
            if (j == charArray.length - 1)
                System.out.print(charArray[j]);
            else
                System.out.print(charArray[j] + ",");
        }
        System.out.println();


//        Задание 3
        for (int j = intArray.length - 1; j >= 0; j--) {
            if (j == 0)
                System.out.print(intArray[j]);
            else
                System.out.print(intArray[j] + ",");
        }
        System.out.println();
        for (int j = doubleArray.length - 1; j >= 0; j--) {
            if (j == 0)
                System.out.print(doubleArray[j]);
            else
                System.out.print(doubleArray[j] + ",");
        }
        System.out.println();
        for (int j = charArray.length - 1; j >= 0; j--) {
            if (j == 0)
                System.out.print(charArray[j]);
            else
                System.out.print(charArray[j] + ",");
        }
        System.out.println();

//        Задание 4
        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] % 2 == 1)
                intArray[j] += 1;
            if (j == intArray.length - 1)
                System.out.print(intArray[j]);
            else
                System.out.print(intArray[j] + ",");
        }

    }
}
