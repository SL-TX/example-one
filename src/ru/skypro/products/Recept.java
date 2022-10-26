package ru.skypro.products;

import java.util.*;

public class Recept {

    Map<Tovar,Integer> mnozhestvoProductov = new HashMap<>();
    private final String name;
    public Integer sumCostTovar(){
        int i=0;
        for (Map.Entry<Tovar,Integer> tovar: mnozhestvoProductov.entrySet()) {

            i+=tovar.getKey().getCost()*tovar.getValue();
        }
        return i;
    }

    public Recept(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Рецепт{" +
                "МножествоПродуктов=" + mnozhestvoProductov +
                ", Название='" + name + '\'' +
                ", СуммарнаяСтоимостьПродуктов='" + sumCostTovar() + '\'' +
                '}';
    }

    public void addToSet(Tovar val, Integer count){
        if (count<1){
            throw new RuntimeException("Количество продукта в рецепте не может быть меньше 1.");
        }
        mnozhestvoProductov.put(val,count);
    }
    public void remFromSet(Tovar val){
        mnozhestvoProductov.remove(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recept recept)) return false;
        return Objects.equals(mnozhestvoProductov, recept.mnozhestvoProductov) && Objects.equals(name, recept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnozhestvoProductov, name);
    }
}
