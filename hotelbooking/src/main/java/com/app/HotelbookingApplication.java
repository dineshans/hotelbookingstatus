package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.service.*"})
@ComponentScan(basePackages = {"com.manager.*"})
@SpringBootApplication
public class HotelbookingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HotelbookingApplication.class, args);
	}

}
