package bertcoscia.Epicode_W17D1.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@Setter
public class Pizza {
    protected String name;
    protected List<Topping> toppings;
    protected int calories;
    protected double price;

    public Pizza(String name, int calories, double price, Topping... toppings) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.toppings = new ArrayList<>();
        Collections.addAll(this.toppings, toppings);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        StringBuilder toppingsBuilder = new StringBuilder();
        this.toppings.forEach(topping -> toppingsBuilder.append(topping.getName()).append(", "));
        if (!toppingsBuilder.isEmpty()) {
            toppingsBuilder.setLength(toppingsBuilder.length() - 2);
        }
        return name + " (" + toppingsBuilder + ") " + calories + " kcal, €" + price;
    }
}
