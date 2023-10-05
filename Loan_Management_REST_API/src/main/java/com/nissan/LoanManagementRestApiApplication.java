package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanManagementRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementRestApiApplication.class, args);
		System.out.println("Welcome to Loan Management Application");
	}

}
