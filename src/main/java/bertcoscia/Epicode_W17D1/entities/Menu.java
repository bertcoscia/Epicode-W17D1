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
        // Intestazioni e separatori
        String header = String.format("%-25s %-10s %s", "Name", "Calories", "Price");
        String separator = "-".repeat(header.length()); // Separatore per chiarezza

        // Stringhe per pizze, topping e bevande
        String pizzasStr = pizzas.stream()
                .map(pizza -> String.format("%-25s %-10d $%.2f", pizza.getName(), pizza.getCalories(), pizza.getPrice()))
                .collect(Collectors.joining("\n"));

        String toppingsStr = toppings.stream()
                .map(topping -> String.format("%-25s %-10d $%.2f", topping.getName(), topping.getCalories(), topping.getPrice()))
                .collect(Collectors.joining("\n"));

        String drinksStr = drinks.stream()
                .map(drink -> String.format("%-25s %-10d $%.2f", drink.getName(), drink.getCalories(), drink.getPrice()))
                .collect(Collectors.joining("\n"));

        // Combinare tutto in una stringa finale
        return header + "\n" + separator + "\n" +
                "Pizzas:\n" + pizzasStr + "\n\n" +
                "Toppings:\n" + toppingsStr + "\n\n" +
                "Drinks:\n" + drinksStr;
    }
}
