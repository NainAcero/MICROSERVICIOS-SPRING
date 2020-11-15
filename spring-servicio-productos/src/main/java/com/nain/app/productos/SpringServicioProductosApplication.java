package com.nain.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"nain.app.commons.models.entity"})
public class SpringServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServicioProductosApplication.class, args);
	}

}
