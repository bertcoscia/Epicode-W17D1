package bertcoscia.Epicode_W17D1;

import bertcoscia.Epicode_W17D1.entities.Pizza;
import bertcoscia.Epicode_W17D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "tomato")
    public Topping tomato() {
        return new Topping("tomato", 12, 0.29);
    }

    @Bean(name = "cheese")
    public Topping cheese() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean(name = "margherita")
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 1104, 4.99, tomato(), cheese());
    }

    @Bean(name = "ham")
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "onions")
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "pineapple")
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "salami")
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(name = "hawaiian")
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", 1024, 6.49, tomato(), cheese(), ham(), pineapple());
    }

    @Bean(name = "salami")
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", 1160, 5.99, tomato(), cheese(), salami());
    }
}
