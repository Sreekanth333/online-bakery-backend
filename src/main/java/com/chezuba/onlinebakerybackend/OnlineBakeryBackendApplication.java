package com.chezuba.onlinebakerybackend;

import com.chezuba.onlinebakerybackend.service.DataInitializerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan(basePackages = "com.chezuba.onlinebakerybackend.entity")
public class OnlineBakeryBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBakeryBackendApplication.class, args);
	}

}
