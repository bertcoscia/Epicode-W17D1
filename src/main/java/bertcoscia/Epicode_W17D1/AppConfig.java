package bertcoscia.Epicode_W17D1;

import bertcoscia.Epicode_W17D1.entities.Drink;
import bertcoscia.Epicode_W17D1.entities.Menu;
import bertcoscia.Epicode_W17D1.entities.Pizza;
import bertcoscia.Epicode_W17D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean(name = "tomato")
    public Topping tomato() { return new Topping("tomato", 12, 0.29); }

    @Bean(name = "cheese")
    public Topping cheese() { return new Topping("cheese", 92, 0.69); }

    @Bean(name = "margherita")
    public Pizza margherita() { return new Pizza("Pizza Margherita", 1104, 4.99, tomato(), cheese()); }

    @Bean(name = "ham")
    public Topping ham() { return new Topping("Ham", 35, 0.99); }

    @Bean(name = "onions")
    public Topping onions() { return new Topping("Onions", 22, 0.69); }

    @Bean(name = "pineapple")
    public Topping pineapple() { return new Topping("Pineapple", 24, 0.79); }

    @Bean(name = "salami")
    public Topping salami() { return new Topping("Salami", 86, 0.99); }

    @Bean(name = "hawaiian")
    public Pizza hawaiian() { return new Pizza("Hawaiian Pizza", 1024, 6.49, tomato(), cheese(), ham(), pineapple()); }

    @Bean(name = "salamiPizza")
    public Pizza salamiPizza() { return new Pizza("Salami Pizza", 1160, 5.99, tomato(), cheese(), salami()); }

    @Bean(name = "lemonade")
    public Drink lemonade() { return new Drink("Lemonade (0.33l)", 128, 1.29); }

    @Bean(name = "water")
    public Drink water() { return new Drink("Water (0.5l)", 0, 1.29);}

    @Bean(name = "wine")
    public Drink wine() { return new Drink("Wine (0.75l, 13%", 607, 7.49); }

    @Bean(name = "menu")
    public Menu menu() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(margherita());
        pizzas.add(hawaiian());
        pizzas.add(salamiPizza());

        List<Topping> toppings = new ArrayList<>();
        toppings.add(cheese());
        toppings.add(ham());
        toppings.add(onions());
        toppings.add(pineapple());
        toppings.add(salami());

        List<Drink> drinks = new ArrayList<>();
        drinks.add(lemonade());
        drinks.add(water());
        drinks.add(wine());

        return new Menu(pizzas, toppings, drinks);
    }

}
