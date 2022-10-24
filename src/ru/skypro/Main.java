package ru.skypro;

import ru.skypro.products.Рецепт;
import ru.skypro.products.Товар;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String,String> ТелефонныйСправочник = new HashMap<>();
        for (int i=0;i<=20;i++) {
            ТелефонныйСправочник.put("f"+i+" i"+i,i+""+i);
        }
        System.out.println(ТелефонныйСправочник);
        //Part2
        Set<Товар> СписокТоваров = new HashSet<>();
        Товар Бананы = new Товар("Банан", 120,10);
        Товар Апельсины = new Товар("Апельсин", 240,10);
        try {
            Товар Тест = new Товар("Тест", 240,null);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            addToSet(СписокТоваров,Бананы);
            addToSet(СписокТоваров,Апельсины);
            addToSet(СписокТоваров,Бананы);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            remFromSet(СписокТоваров,Бананы);
            remFromSet(СписокТоваров,Бананы);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(СписокТоваров.toArray()));
        addToSet(СписокТоваров,Бананы);
        Set<Рецепт> СписокРецептов = new HashSet<>();
        Рецепт рецепт1 = new Рецепт("Рецепт 1");
        Рецепт рецепт2 = new Рецепт("Рецепт 2");
        рецепт1.addToSet(Бананы,2);
        рецепт1.addToSet(Апельсины,1);
        рецепт2.addToSet(Бананы,1);
        рецепт2.addToSet(Апельсины,3);
        try {
            addToSet(СписокРецептов,рецепт1);
            addToSet(СписокРецептов,рецепт2);
            addToSet(СписокРецептов,рецепт1);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(СписокРецептов.toArray()));

    }
    private static <T> void addToSet(Set<T> set, T val){
        if (!set.add(val)){
            throw new RuntimeException("необходимо выбросить исключение");
        }
    }
    private static <T> void remFromSet(Set<T> set, T val) {
        if (!set.remove(val)) {
            throw new RuntimeException("Ошибка удаления товара");
        }
    }

}
