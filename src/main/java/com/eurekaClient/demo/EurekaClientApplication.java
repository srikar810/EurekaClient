package com.eurekaClient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		System.out.println("EurekaClientApplication");
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
