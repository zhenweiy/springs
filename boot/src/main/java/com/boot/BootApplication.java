package com.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BootApplication {

	private static final Logger logger = LoggerFactory
			.getLogger(BootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		logger.debug("Welocme to spring boot appliaction!");
		return "<h1>Spring Boot!</h1><br>Welocme to spring boot appliaction!";
	}
}
