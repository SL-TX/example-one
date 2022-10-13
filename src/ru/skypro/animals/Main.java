package ru.skypro.animals;

import ru.skypro.animals.flying.Albotros;

//Main class for test Part3
public class Main {
    public static void main(String[] args) {
        Albotros albotros = new Albotros("alba", 7,"sever",null);
        System.out.println(albotros);
    }

    public static class CheckUtil {

        public static String checkString (String string, String elseString) {
            return string == null || string.length() == 0 ? elseString: string;
        }
        public static Integer checkInteger (Integer integer, Integer elseInt) {
            return integer == null || integer<0 ? elseInt: integer;
        }
    }
}
