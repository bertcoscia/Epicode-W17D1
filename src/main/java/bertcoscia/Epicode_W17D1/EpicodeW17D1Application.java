package bertcoscia.Epicode_W17D1;

import bertcoscia.Epicode_W17D1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EpicodeW17D1Application {

	public static void main(String[] args) {
		SpringApplication.run(EpicodeW17D1Application.class, args);

		Topping tomato = new Topping("tomato", 12, 0.29);
		Topping cheese = new Topping("cheese", 92, 0.69);
	}

}
