package bertcoscia.Epicode_W17D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
        Collections.addAll(this.toppings, toppings);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

}
