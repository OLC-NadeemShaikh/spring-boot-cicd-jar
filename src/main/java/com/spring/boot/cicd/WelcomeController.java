			package com.spring.boot.cicd;
			import org.springframework.web.bind.annotation.GetMapping;
			import org.springframework.web.bind.annotation.RestController;
			@RestController
			public class WelcomeController {
				@GetMapping("/welcome")
				public String getMessage() {
					return "Welcome to Spring Boot!";
				}
			}