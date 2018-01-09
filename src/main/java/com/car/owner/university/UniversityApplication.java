package com.car.owner.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class UniversityApplication {

	@RequestMapping(value = "/")
	public String hello(){
		return "Hello Spring boot";

	}

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}
}
