package com.example.github_action_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionDemoApplication {

	@GetMapping("/")
	public String index() {
		return "Welcome to Github Action Demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionDemoApplication.class, args);
	}

}
