package com.edutech.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClassroomEurekaModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassroomEurekaModuleApplication.class, args);
	}

}
