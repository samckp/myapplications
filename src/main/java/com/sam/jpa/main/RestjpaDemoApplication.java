package com.sam.jpa.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.sam.jpa")
@EnableJpaRepositories("com.sam.jpa.repository")
@EntityScan("com.sam.jpa.dao")
@EnableSwagger2
public class RestjpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestjpaDemoApplication.class, args);
	}

}

