package nain.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicioConfigServerApplication.class, args);
	}

}
