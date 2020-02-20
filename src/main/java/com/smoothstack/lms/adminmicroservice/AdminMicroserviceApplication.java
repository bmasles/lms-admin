package com.smoothstack.lms.adminmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootApplication
public class AdminMicroserviceApplication {
	
	@LocalServerPort
	int port;

	public static void main(String[] args) {
		SpringApplication.run(AdminMicroserviceApplication.class, args);
		System.out.println(port);
	}

}
