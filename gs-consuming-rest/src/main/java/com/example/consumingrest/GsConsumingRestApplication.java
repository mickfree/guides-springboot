package com.example.consumingrest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GsConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(GsConsumingRestApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(GsConsumingRestApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		// RestTemplate, es una clase de Spring utilizada para realizar solicitudes HTTP a endpoints remotos.
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			Quote quote = restTemplate.getForObject(
					"http://localhost:8080/api/random", Quote.class);
			log.info(quote.toString());
		};
	}


}
