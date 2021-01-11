package com.pj3275.mytable;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.pj3275.mytable"})
@EnableTransactionManagement
@EntityScan(basePackages="com.pj3275.mytable.model")
public class ApplicationStarter implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

	}

}
