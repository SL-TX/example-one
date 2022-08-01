package ru.skypro;

public class Main {
    public static void main(String[] args){

//      Задание 1
        int i = Integer.MAX_VALUE;
        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        long l = Long.MAX_VALUE;
        double d = Double.MAX_VALUE;
        float f = Float.MAX_VALUE;
        boolean fl = Boolean.TRUE;
        char c = Character.MAX_VALUE;
        i = 1000;
        b = 120;
        s = 13;
        l = 155L;
        d = 4.5;
        f = 3.5f;
        fl = d == l;
        c = '+';

//      Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;

        System.out.println("Общий вес двух бойцов "+(boxer1+boxer2)+" кг.");
        System.out.println("Разница между весами бойцов "+Math.abs(boxer1-boxer2)+" кг.");

//      Задание 3
        int bananaNum = 5;
        int milkMl = 283;
        int iceNum = 2;
        int eggNum = 4;
        int bananaWeight = 80;
        int milk100MlWeight = 105;
        int iceWeight = 100;
        int eggWeigth =70;
        int result1 = (int) (bananaNum * bananaWeight +
                ((double)milkMl / 100) * milk100MlWeight +
                iceNum * iceWeight +
                eggNum * eggWeigth);
        double result2 =
                (double)result1/1000;
        System.out.println("вес такого спорт-завтрака "+(result1)+" г.");
        System.out.println("вес такого спорт-завтрака "+(result2)+" кг.");

//      Задание 4
        int weigthToLoseInKg = 7;
        int try1 = 250;
        int try2 = 500;
        double dayRawTry1 = weigthToLoseInKg * 1000 / (double)try1;
        int dayNums1 = (int) Math.ceil(dayRawTry1);
        double dayRawTry2 = weigthToLoseInKg * 1000 / (double)try2;
        int dayNums2 = (int) Math.ceil(dayRawTry2);
        System.out.println("Дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм: "+ dayNums1);
        System.out.println("Дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм: "+ dayNums2);
        int vSrednem = ((dayNums1 + dayNums2) / 2);
        System.out.println("Потребуется дней в среднем, чтобы добиться результата похудения: "+ vSrednem);


//      Задание 5
        int percent = 10;
        int mashaVal = 67760;
        int denVal = 83690;
        int kristVal = 76230;
        int mashaValUp = (int) (mashaVal * (1+percent/100f));
        int denValUp = (int) (denVal * (1+percent/100f));
        int kristValUp = (int) (kristVal * (1+percent/100f));
        int mashaValYearDiff = (mashaValUp - mashaVal)*12;
        int denValYearDiff = (denValUp - denVal)*12;
        int kristValYearDiff = (kristValUp - kristVal)*12;
        System.out.println("Маша теперь получает "+mashaValUp+" рублей. Годовой доход вырос на "+mashaValYearDiff+" рублей");
        System.out.println("Денис теперь получает "+denValUp+" рублей. Годовой доход вырос на "+denValYearDiff+" рублей");
        System.out.println("Кристина теперь получает "+kristValUp+" рублей. Годовой доход вырос на "+kristValYearDiff+" рублей");

    }
}
