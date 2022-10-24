package ru.skypro;

import ru.skypro.products.Рецепт;
import ru.skypro.products.Товар;

import java.util.*;
import java.util.stream.Collectors;

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
        //part3
        collection.put("str1",2);
        addToCollection("str2",1);
        try {
        addToCollection("str1",2);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        addToCollection("str1",5);
        System.out.println(collection);
        //part 2 1
        var r= new Random();
        for (int i = 0; i<5;i++){
            String key = "key"+i;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j<3;j++){
                list.add(r.nextInt(1000));
            }
            collection2.put(key,list);
        }
        System.out.println(collection2);
        Map<String,Integer> newCollection = collection2.entrySet().stream().collect(
                Collectors.toMap(Map.Entry::getKey,e->e.getValue().stream().mapToInt(i-> i).sum())
        );
        System.out.println(newCollection);
        //part 2 2
        Map<Integer, String> orderedHashMap = new LinkedHashMap<>();
        for (int i = 0; i<10;i++){
            orderedHashMap.put(i,"text"+i+" asd");
        }
        for (Map.Entry<Integer, String> el:orderedHashMap.entrySet()) {
            System.out.println(el.getKey()+":"+el.getValue());
        }
    }
    static Map<String, List<Integer>> collection2 = new HashMap<>();
    static Map<String, Integer> collection = new HashMap<>();
    private static void addToCollection(String key, Integer val ){
        if (!collection.containsKey(key)){
            collection.put(key,val);
        } else if (Objects.equals(collection.get(key), val)) {
            throw new RuntimeException();
        } else {
            collection.replace(key,val);
        }

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
