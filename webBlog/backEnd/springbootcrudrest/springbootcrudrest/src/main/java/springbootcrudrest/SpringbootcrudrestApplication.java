package springbootcrudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class SpringbootcrudrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudrestApplication.class, args);
	}

}
