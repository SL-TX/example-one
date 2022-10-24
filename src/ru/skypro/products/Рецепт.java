package ru.skypro.products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Рецепт {

    Set<Товар> МножествоПродуктов = new HashSet<>();
    private final String Название;
    public Integer СуммарнаяСтоимостьПродуктов(){
        int i=0;
        for (Товар товар :МножествоПродуктов) {
            i+=товар.getЦена();
        }
        return i;
    }

    public Рецепт(Set<Товар> множествоПродуктов, String название) {
        МножествоПродуктов = множествоПродуктов;
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

    public void addToSet(Товар val){
        МножествоПродуктов.add(val);
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
