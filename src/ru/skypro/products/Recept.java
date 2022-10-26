package ru.skypro.products;

import java.util.*;

public class Recept {

    Map<Tovar,Integer> MnozhestvoProductov = new HashMap<>();
    private final String name;
    public Integer SumCostTovar(){
        int i=0;
        for (Map.Entry<Tovar,Integer> tovar: MnozhestvoProductov.entrySet()) {

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
                "МножествоПродуктов=" + MnozhestvoProductov +
                ", Название='" + name + '\'' +
                ", СуммарнаяСтоимостьПродуктов='" + SumCostTovar() + '\'' +
                '}';
    }

    public void addToSet(Tovar val, Integer count){
        if (count<1){
            throw new RuntimeException("Количество продукта в рецепте не может быть меньше 1.");
        }
        MnozhestvoProductov.put(val,count);
    }
    public void remFromSet(Tovar val){
        MnozhestvoProductov.remove(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recept recept)) return false;
        return Objects.equals(MnozhestvoProductov, recept.MnozhestvoProductov) && Objects.equals(name, recept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MnozhestvoProductov, name);
    }
}
