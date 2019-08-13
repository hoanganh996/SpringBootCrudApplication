package com.websystique.springboot.SpringBootCRUDApplicationExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.websystique.springboot.SpringBootCRUDApplicationExample.configuration.JpaConfiguration;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.websystique.springboot.SpringBootCRUDApplicationExample"})
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
