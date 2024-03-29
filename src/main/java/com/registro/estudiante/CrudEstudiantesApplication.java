package com.registro.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude=DataSourceAutoConfiguration.class)
public class CrudEstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudEstudiantesApplication.class, args);
	}

}
