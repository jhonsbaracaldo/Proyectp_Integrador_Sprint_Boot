package Ada.SprintBoot.ProyectSprintBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProyectSprintBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectSprintBootApplication.class, args);
	}
	@GetMapping("/holi")

	public String checkAPI(){
		return "The API is working ok!";
	}

}
