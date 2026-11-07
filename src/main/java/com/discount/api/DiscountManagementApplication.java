package com.discount.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DiscountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountManagementApplication.class, args);
	}

}
