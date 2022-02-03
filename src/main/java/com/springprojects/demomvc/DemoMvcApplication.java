package com.springprojects.demomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // marks the DemoMvcApplication class as the request handler
public class DemoMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMvcApplication.class, args);
	}

	@GetMapping("/hello") // maps the sayHello() method to GET requests for /hello
	public String sayHello(@RequestParam(value = "myName", defaultValue = "Word") String name) {
		// RequestParam maps the name parameter to the myName web request parameter, and default value to Word
		return String.format("Hello %s!", name);
	}
	

}
