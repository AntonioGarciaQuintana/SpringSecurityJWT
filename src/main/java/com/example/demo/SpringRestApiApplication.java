package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// @Configuration
// @EnableAutoConfiguration
@SpringBootApplication
@EntityScan(value = {"com.example.model"})
@EnableJpaRepositories(repositoryImplementationPostfix = "", basePackages = {"com.example.repository"})
@ComponentScan( basePackages = "com.example")
public class SpringRestApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringRestApiApplication.class);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

	
}

