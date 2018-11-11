package com.example.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringprototypedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprototypedemoApplication.class, args);
	}
	
	
	@Bean	
	HelloWorldServiceFactory helloWorldServiceFactory() {
		return new HelloWorldServiceFactory();
	}

	@Bean	
	ProfileContextFactory profileContextFactory() {
		return new ProfileContextFactory();
	}
	@Bean	
	WorkerManagerFactory workerManagerFactory() {
		return new WorkerManagerFactory();
	}
	
	
}
