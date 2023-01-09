package com.example.labour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LabourApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabourApplication.class, args);
	}

}
