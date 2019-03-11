package com.udea.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceUdeaRegistrationApplication {

		
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUdeaRegistrationApplication.class, args);
	}

}
