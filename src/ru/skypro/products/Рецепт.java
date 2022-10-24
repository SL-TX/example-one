package ru.skypro.products;

import java.util.*;

public class Рецепт {

    Map<Товар,Integer> МножествоПродуктов = new HashMap<>();
    private final String Название;
    public Integer СуммарнаяСтоимостьПродуктов(){
        int i=0;
        for (Map.Entry<Товар,Integer> товар:МножествоПродуктов.entrySet()) {

            i+=товар.getKey().getЦена()*товар.getValue();
        }
        return i;
    }

    public Рецепт(String название) {
        Название = название;
    }

    @Override
    public String toString() {
        return "Рецепт{" +
                "МножествоПродуктов=" + МножествоПродуктов +
                ", Название='" + Название + '\'' +
                ", СуммарнаяСтоимостьПродуктов='" + СуммарнаяСтоимостьПродуктов() + '\'' +
                '}';
    }

    public void addToSet(Товар val,Integer count){
        if (count<1){
            throw new RuntimeException("Количество продукта в рецепте не может быть меньше 1.");
        }
        МножествоПродуктов.put(val,count);
    }
    public void remFromSet(Товар val){
        МножествоПродуктов.remove(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Рецепт рецепт)) return false;
        return Objects.equals(МножествоПродуктов, рецепт.МножествоПродуктов) && Objects.equals(Название, рецепт.Название);
    }

    @Override
    public int hashCode() {
        return Objects.hash(МножествоПродуктов, Название);
    }
}
