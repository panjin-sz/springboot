package com.panjin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PjServerProvider01Application {

	public static void main(String[] args) {
		SpringApplication.run(PjServerProvider01Application.class, args);
	}
}
