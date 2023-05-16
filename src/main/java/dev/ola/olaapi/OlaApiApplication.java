package dev.ola.olaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OlaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaApiApplication.class, args);
	}

	@GetMapping("/public/hello")
	String publicHello() {
		return "hello world";
	}

	@GetMapping("/hello")
	String hello() {
		return "hello stranger";
	}

}
