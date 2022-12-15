package br.com.digitalhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class GoCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoCarApplication.class, args);

	}



}