package com.example.punto4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Punto4Application {

	public static void main(String[] args) {
		SpringApplication.run(Punto4Application.class, args);
	}

}
