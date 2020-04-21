package com.microservice;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

@RestController
@RequestMapping("/helloworld")
@SpringBootApplication
public class MicroserviceApplication {

	int strLength = 0;
	Logger logger = LoggerFactory.getLogger(MicroserviceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}
	
	@GetMapping("/{name}")
	public String greet(@PathVariable String name) {
		
		strLength = name.length();
		if(strLength = 5) 
			logger.warn("User: " + name + " trying to use the greet service");
		
		return (LocalDateTime.now().getHour() < 12 ? "Good Morning " : "Have a nice day ahead ") 
				+ name;
	}
}
