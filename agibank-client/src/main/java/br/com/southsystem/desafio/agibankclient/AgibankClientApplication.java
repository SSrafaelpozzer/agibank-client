package br.com.southsystem.desafio.agibankclient;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@ComponentScan("br.com.southsystem.desafio.agibankclient")
public class AgibankClientApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AgibankClientApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
	}

}
