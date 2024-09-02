package bertcoscia.Epicode_W17D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    @Override
    public String toString() {
        String header = String.format("%-30s %-10s %s", "Name", "Calories", "Price");
        String separator = "-".repeat(header.length());

        String pizzasStr = pizzas.stream()
                .map(pizza -> {
                    String toppingsList = pizza.getToppings().stream()
                            .map(Topping::getName)
                            .collect(Collectors.joining(", "));
                    return String.format("%-30s %-10d $%.2f",
                            pizza.getName() + " (" + toppingsList + ")",
                            pizza.getCalories(),
                            pizza.getPrice());
                })
                .collect(Collectors.joining("\n"));

        String toppingsStr = toppings.stream()
                .map(topping -> String.format("%-30s %-10d $%.2f",
                        topping.getName(),
                        topping.getCalories(),
                        topping.getPrice()))
                .collect(Collectors.joining("\n"));

        String drinksStr = drinks.stream()
                .map(drink -> String.format("%-30s %-10d $%.2f",
                        drink.getName(),
                        drink.getCalories(),
                        drink.getPrice()))
                .collect(Collectors.joining("\n"));

        return header + "\n" + separator + "\n" +
                "Pizzas:\n" + pizzasStr + "\n\n" +
                "Toppings:\n" + toppingsStr + "\n\n" +
                "Drinks:\n" + drinksStr;
    }
}
