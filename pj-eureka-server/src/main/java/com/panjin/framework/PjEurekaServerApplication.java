package com.panjin.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PjEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjEurekaServerApplication.class, args);
	}
}
