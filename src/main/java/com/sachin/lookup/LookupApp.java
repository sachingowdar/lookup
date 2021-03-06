package com.sachin.lookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LookupApp {

	public static void main(String[] args) {
		SpringApplication.run(LookupApp.class, args);
	}
}
