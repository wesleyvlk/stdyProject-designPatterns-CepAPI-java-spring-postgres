package com.dio.stdyprojectcep_apispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - PostgreSQL
 * - OpenFeign
 * - Lombok
 * 
 * @see falvojr
 * @author wesleyvlk
 */

@EnableFeignClients
@SpringBootApplication
public class StdyprojectCepApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StdyprojectCepApiSpringApplication.class, args);
	}

}
