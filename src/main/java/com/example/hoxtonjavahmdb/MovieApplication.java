package com.example.hoxtonjavahmdb;

// import SpringApplication from "SpringApplication"
import org.springframework.boot.SpringApplication;

// import SpringBootApplication from "SpringBootApplication"
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation / decorator
@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

}