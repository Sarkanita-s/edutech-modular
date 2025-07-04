package com.edutech.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.edutech.support.client")
@SpringBootApplication(scanBasePackages = {"com.edutech.support"})
public class ClassroomSupportModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassroomSupportModuleApplication.class, args);
	}

}
