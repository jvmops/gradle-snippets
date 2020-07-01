package com.jvmops.apps.dummy.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@PostConstruct
	void hello() {
		System.out.println(">>>>>> Hello from dummy-job!");
	}
}
