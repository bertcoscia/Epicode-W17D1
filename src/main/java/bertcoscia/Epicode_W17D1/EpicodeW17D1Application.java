package bertcoscia.Epicode_W17D1;

import bertcoscia.Epicode_W17D1.entities.Pizza;
import bertcoscia.Epicode_W17D1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EpicodeW17D1Application {

	public static void main(String[] args) {
		SpringApplication.run(EpicodeW17D1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EpicodeW17D1Application.class);

		Pizza margherita = (Pizza) context.getBean("margherita");
		System.out.println(margherita);
	}

}
