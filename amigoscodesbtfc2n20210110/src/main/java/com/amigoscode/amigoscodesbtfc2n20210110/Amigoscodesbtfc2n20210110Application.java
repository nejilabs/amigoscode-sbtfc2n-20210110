package com.amigoscode.amigoscodesbtfc2n20210110;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Amigoscodesbtfc2n20210110Application {

	public static void main(String[] args) {
		SpringApplication.run(Amigoscodesbtfc2n20210110Application.class, args);
	}

	// @GetMapping
	// public String hello(){
	// 	return "Hello World";
	// }

	@GetMapping
	public List<String> hello(){
		return List.of("Hello", "World");
	}

}
