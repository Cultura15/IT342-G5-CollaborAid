package com.collaboraid.collaboraid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CollaboraidApplication {

	public static void main(String[] args) {

		SpringApplication.run(CollaboraidApplication.class, args);

	}

}
