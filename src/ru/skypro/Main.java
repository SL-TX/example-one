package ru.skypro;

public class Main {
    public static void main(String[] args) {

//        Задание 1
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = {1.57, 7.654, 9.986};
        char[] c = {'G', 'O', 'O', 'D'};

//        Задание 2
        for (int j = 0; j < i.length; j++) {
            if (j == i.length - 1)
                System.out.print(i[j]);
            else
                System.out.print(i[j] + ",");
        }
        System.out.println();
        for (int j = 0; j < d.length; j++) {
            if (j == d.length - 1)
                System.out.print(d[j]);
            else
                System.out.print(d[j] + ",");
        }
        System.out.println();
        for (int j = 0; j < c.length; j++) {
            if (j == c.length - 1)
                System.out.print(c[j]);
            else
                System.out.print(c[j] + ",");
        }
        System.out.println();


//        Задание 3
        for (int j = i.length-1; j >= 0 ; j--) {
            if (j == 0)
                System.out.print(i[j]);
            else
                System.out.print(i[j] + ",");
        }
        System.out.println();
        for (int j = d.length-1; j >= 0 ; j--) {
            if (j == 0)
                System.out.print(d[j]);
            else
                System.out.print(d[j] + ",");
        }
        System.out.println();
        for (int j = c.length-1; j >= 0 ; j--) {
            if (j == 0)
                System.out.print(c[j]);
            else
                System.out.print(c[j] + ",");
        }
        System.out.println();

//        Задание 4
        for (int j = 0; j < i.length; j++) {
            if (i[j]%2==1)
                i[j]+=1;
            if (j == i.length - 1)
                System.out.print(i[j]);
            else
                System.out.print(i[j] + ",");
        }

    }
}
