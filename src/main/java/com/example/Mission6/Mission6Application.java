package com.example.Mission6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class Mission6Application {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod");
		// anything other than 'prod' and 'test' would be sent to the default one 'application.properties'
		SpringApplication.run(HelloController.class, args);
	}
}
