package br.com.southsystem.desafio.agibankclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Controller
public class WebClientCaller {

	public WebClientCaller() {
		super();
		init();
	}

	public void init() {
		WebClient client = WebClient.create("http://localhost:8080");

		Mono<Void> mono = client.get().uri("/desafioAgibank/analisar").retrieve().bodyToMono(Void.class);
		mono.subscribe(System.out::println);
		
		System.out.println("Finish method");

	}

}
