package ru.skypro.animals;

import ru.skypro.animals.hierarchy.*;

//Main class for test Part3
public class Main {
    public static void main(String[] args) {
        var Albotros = new Flying("Albotros",4,"asd","walk");
        var Chaika = new Flying("Chaika",4,"asd","walk");
        var Sokol = new Flying("Sokol",4,"asd","walk");
        var Hiena = new Hischniki("Hiena",4,"asd",20,"asd");
        var Medved = new Hischniki("Medved",4,"asd",20,"asd");
        var Tigr = new Hischniki("Tigr",4,"asd",20,"asd");
        var Dodo = new NoFlying("Dodo",4,"asd","walk");
        var Pavlin = new NoFlying("Pavlin",4,"asd","walk");
        var Pingvin = new NoFlying("Pingvin",4,"asd","walk");
        var Gazel = new Travoyadnie("Gazel",4,"asd",12,"asd");
        var Loshad = new Travoyadnie("Loshad",4,"asd",13,"asd");
        var Zhiraf = new Travoyadnie("Zhiraf",4,"asd",14,"asd");
        var Fog = new Zemnovodnie("Fog",4,"asd");
        var Uzh = new Zemnovodnie("Uzh",4,"asd");
        System.out.println(Albotros);
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
