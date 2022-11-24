package ru.skypro;

import java.util.Set;

public final class Utils {

    static <T> void addToSet(Set<T> set, T val){
        if (!set.add(val)){
            throw new RuntimeException("необходимо выбросить исключение");
        }
    }

    static <T> void remFromSet(Set<T> set, T val){
        if(!set.remove(val)){
            throw new RuntimeException("Ошибка удаления товара");
        }
    }
}
