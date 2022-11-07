package ru.skypro.products;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recept {

    Set<Product> setProducts = new HashSet<>();
    private final String name;
    public Integer SumCostProducts(){
        int i=0;
        for (Product product : setProducts) {
            i+= product.getCost();
        }
        return i;
    }

    public Recept(Set<Product> setProducts, String name) {
        this.setProducts = setProducts;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Рецепт{" +
                "МножествоПродуктов=" + setProducts +
                ", Название='" + name + '\'' +
                ", СуммарнаяСтоимостьПродуктов='" + SumCostProducts() + '\'' +
                '}';
    }

    public void addToSet(Product val){
        setProducts.add(val);
    }
    public void remFromSet(Product val){
        setProducts.remove(val);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recept recept)) return false;
        return Objects.equals(setProducts, recept.setProducts) && Objects.equals(name, recept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setProducts, name);
    }
}
