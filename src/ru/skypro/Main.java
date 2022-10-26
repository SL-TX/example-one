package ru.skypro;

import ru.skypro.products.Recept;
import ru.skypro.products.Tovar;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Map<String,String> TelefonniiSpravochnik = new HashMap<>();
        for (int i=0;i<=20;i++) {
            TelefonniiSpravochnik.put("f"+i+" i"+i,i+""+i);
        }
        System.out.println(TelefonniiSpravochnik);
        //Part2
        Set<Tovar> SpisokTovarov = new HashSet<>();
        Tovar Banan = new Tovar("Банан", 120,10);
        Tovar Apelsin = new Tovar("Апельсин", 240,10);
        try {
            Tovar test = new Tovar("Тест", 240,null);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            addToSet(SpisokTovarov,Banan);
            addToSet(SpisokTovarov,Apelsin);
            addToSet(SpisokTovarov,Banan);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            remFromSet(SpisokTovarov,Banan);
            remFromSet(SpisokTovarov,Banan);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(SpisokTovarov.toArray()));
        addToSet(SpisokTovarov,Banan);
        Set<Recept> SpisokReceptov = new HashSet<>();
        Recept recept1 = new Recept("Рецепт 1");
        Recept recept2 = new Recept("Рецепт 2");
        recept1.addToSet(Banan,2);
        recept1.addToSet(Apelsin,1);
        recept2.addToSet(Banan,1);
        recept2.addToSet(Apelsin,3);
        try {
            addToSet(SpisokReceptov, recept1);
            addToSet(SpisokReceptov, recept2);
            addToSet(SpisokReceptov, recept1);
        } catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println(List.of(SpisokReceptov.toArray()));
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
