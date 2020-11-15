package nain.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"nain.example.usuarios.commons.models.entity"})
@SpringBootApplication
public class SpringServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicioUsuariosApplication.class, args);
	}

}
