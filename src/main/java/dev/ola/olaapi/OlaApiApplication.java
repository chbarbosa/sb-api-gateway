package dev.ola.olaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OlaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaApiApplication.class, args);
	}
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()

			.route(p -> p
				.path("/api/user/**")
				.and().method("GET")
				.filters(f -> f.addRequestHeader("Authorization", "Bearer " + genToken()))
				.uri("http://localhost:8081"))
			.build();
	}

	private String genToken() {
		return null;
	}

}
