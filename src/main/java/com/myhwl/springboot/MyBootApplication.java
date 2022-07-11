package com.myhwl.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
	public static void main(String[] args) {
		System.out.println("Starting Boot Application");
		System.out.println("Update -1 Rishi Sharma ");
		System.out.println("Update -2 by Rishi Sharma");
		SpringApplication.run(MyBootApplication.class, args);
	}
}
